package Leetcode75;

import java.util.Arrays;

/*
Link: https://leetcode.com/problems/unique-paths/description/
62. Unique Paths
 */
public class L63_Medium62_Unique_Paths {
    // Approach: Dynamic Programming
    public int uniquePaths(int m, int n) {
        int[][] d = new int[m][n];

        for (int[] arr : d) {
            Arrays.fill(arr, 1);
        }
        for (int col = 1; col < m; ++col) {
            for (int row = 1; row < n; ++row) {
                d[col][row] = d[col - 1][row] + d[col][row - 1];
            }
        }
        return d[m - 1][n - 1];
    }
    // time = O(N×M)
    // space = O(N×M)
}
