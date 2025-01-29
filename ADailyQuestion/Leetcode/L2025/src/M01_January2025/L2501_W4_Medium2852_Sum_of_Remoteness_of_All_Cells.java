package M01_January2025;
/*
Link:
2852. Sum of Remoteness of All Cells
Topic: Hash table, DFS, BFS
 */
public class L2501_W4_Medium2852_Sum_of_Remoteness_of_All_Cells {
    // Direction arrays for moving up, down, left, right
    private static final int[][] dir = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    public static long sumRemoteness(int[][] grid) {
        int n = grid.length;
        // Calculate total sum of all non-blocked cells
        long totalSum = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] != -1) {
                    totalSum += grid[row][col];
                }
            }
        }

        // Calculate remoteness for each non-blocked cell
        long result = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] > 0) {
                    // arr[0] = sum of reachable cells
                    // arr[1] = count of reachable cells
                    long[] arr = new long[2];
                    dfs(grid, row, col, arr);

                    // For each reachable cell, add unreachable sum to result
                    // unreachable sum = totalSum - sum of reachable cells
                    result += (totalSum - arr[0]) * arr[1];
                }
            }
        }
        return result;
    }
    // time = O(n^2)
    // space = O(n^2)

    // DFS to find sum and count of all cells reachable from (row, col)
    private static void dfs(int[][] grid, int row, int col, long[] arr) {
        arr[0] += grid[row][col]; // Add current cell value to sum
        arr[1]++; // Increment reachable cells count
        grid[row][col] = -1; // Mark as visited

        // Explore all 4 directions
        for (int[] d : dir) {
            int newRow = row + d[0];
            int newCol = col + d[1];
            if (isValid(grid, newRow, newCol)) {
                dfs(grid, newRow, newCol, arr);
            }
        }
    }

    // Checks if cell (row, col) is within grid bounds and not blocked/visited
    private static boolean isValid(int[][] grid, int row, int col) {
        int n = grid.length;
        return row >= 0 && col >= 0 && row < n && col < n && grid[row][col] > 0;
    }

    public static void main(String[] args) {
        int[][] grid1 = {{-1,1,-1},{5,-1,4},{-1,3,-1}};
        System.out.println(sumRemoteness(grid1)); // 39

        int[][] grid2 = {{-1,3,4},{-1,-1,-1},{3,-1,-1}};
        System.out.println(sumRemoteness(grid2)); // 13

        int[][] grid3 = {{1}};
        System.out.println(sumRemoteness(grid3)); // 0
    }
}
