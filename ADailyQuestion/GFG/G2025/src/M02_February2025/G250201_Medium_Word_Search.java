package M02_February2025;
/*
Link: https://www.geeksforgeeks.org/problems/word-search/1
Word Search
Topic: Recursion, DFS, Graph
 */
public class G250201_Medium_Word_Search {
    public static boolean isWordExist(char[][] b, String w) {
        for (int i = 0; i < b.length; i++)
            for (int j = 0; j < b[0].length; j++)
                if (b[i][j] == w.charAt(0) && dfs(b, w, i, j, 0))
                    return true;
        return false;
    }
    // time =  O(m * n * 4^k)
    // space = O(k)

    private static boolean dfs(char[][] b, String w, int i, int j, int k) {
        if (k == w.length()) return true;
        if (i < 0 || j < 0 || i >= b.length || j >= b[0].length || b[i][j] != w.charAt(k)) return false;
        char t = b[i][j];
        b[i][j] = '#';
        boolean f = dfs(b, w, i - 1, j, k + 1) || dfs(b, w, i + 1, j, k + 1) ||
                dfs(b, w, i, j - 1, k + 1) || dfs(b, w, i, j + 1, k + 1);
        b[i][j] = t;
        return f;
    }

    public static void main(String[] args) {
        char[][] mat = {{'T', 'E', 'E'}, {'S', 'G', 'K'}, {'T', 'E', 'L'}};
        String word = "GEEK";
        System.out.println(isWordExist(mat, word)); // true
    }
}
