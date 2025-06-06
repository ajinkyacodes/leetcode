package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/solve-the-sudoku-1587115621/1
Solve the Sudoku
Topic: Backtracking
 */
public class G250131_Hard_Solve_the_Sudoku {
    // Function to find a solved Sudoku.
    static void solveSudoku(int[][] b) {
        int[] r = new int[9], c = new int[9], box = new int[9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (b[i][j] != 0) {
                    int m = 1 << b[i][j], idx = i / 3 * 3 + j / 3;
                    r[i] |= m; c[j] |= m; box[idx] |= m;
                }
        solve(b, r, c, box, 0, 0);
    }
    // time = O(9^(N^2))
    // space = O(1)

    public static boolean solve(int[][] b, int[] r, int[] c, int[] box, int i, int j) {
        if (i == 9) return true;
        if (j == 9) return solve(b, r, c, box, i + 1, 0);
        if (b[i][j] != 0) return solve(b, r, c, box, i, j + 1);
        for (int num = 1, m; num <= 9; num++) {
            m = 1 << num;
            int idx = i / 3 * 3 + j / 3;
            if ((r[i] & m) != 0 || (c[j] & m) != 0 || (box[idx] & m) != 0) continue;
            b[i][j] = num; r[i] |= m; c[j] |= m; box[idx] |= m;
            if (solve(b, r, c, box, i, j + 1)) return true;
            b[i][j] = 0; r[i] &= ~m; c[j] &= ~m; box[idx] &= ~m;
        }
        return false;
    }
}
