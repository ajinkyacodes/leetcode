package M03_March2025;
/*
Link: https://www.geeksforgeeks.org/problems/count-palindrome-sub-strings-of-a-string0652/1
Palindrome SubStrings
 */
public class G250309_Medium_Palindrome_SubStrings {
    public int countPS(String s) {
        int n = s.length(), res = 0;
        boolean[][] dp = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = true;
            for (int j = i + 1; j < n; j++)
                if (s.charAt(i) == s.charAt(j) && (j - i == 1 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    res++;
                }
        }
        return res;
    }
    // time = O(n^2)
    // space = O(n^2)
}
