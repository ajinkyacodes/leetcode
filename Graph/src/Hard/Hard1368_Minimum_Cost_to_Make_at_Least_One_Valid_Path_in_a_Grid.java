package Hard;
/*
Link: https://leetcode.com/problems/minimum-cost-to-make-at-least-one-valid-path-in-a-grid/description/
1368. Minimum Cost to Make at Least One Valid Path in a Grid
Topics: Graph, Breadth First Search, Heap(Priority Queue), Shortest Path
 */

import java.util.Arrays;
import java.util.PriorityQueue;

public class Hard1368_Minimum_Cost_to_Make_at_Least_One_Valid_Path_in_a_Grid {
    // Direction vectors: right, left, down, up (matching grid values 1,2,3,4)
    static int[][] dirs = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    // Dijkstra's Algorithm Approach
    public static int minCost(int[][] grid) {
        int numRows = grid.length, numCols = grid[0].length;

        // Min-heap ordered by cost. Each element is [cost, row, col]
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[] { 0, 0, 0 });

        // Track minimum cost to reach each cell
        int[][] minCost = new int[numRows][numCols];
        for (int row = 0; row < numRows; row++) {
            Arrays.fill(minCost[row], Integer.MAX_VALUE);
        }
        minCost[0][0] = 0;

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int cost = curr[0], row = curr[1], col = curr[2];

            // Skip if we've found a better path to this cell
            if (minCost[row][col] != cost) continue;

            // Try all four directions
            for (int dir = 0; dir < 4; dir++) {
                int newRow = row + dirs[dir][0];
                int newCol = col + dirs[dir][1];

                // Check if new position is valid
                if (
                        newRow >= 0 &&
                                newRow < numRows &&
                                newCol >= 0 &&
                                newCol < numCols
                ) {
                    // Add cost=1 if we need to change direction
                    int newCost = cost + (dir != (grid[row][col] - 1) ? 1 : 0);

                    // Update if we found a better path
                    if (minCost[newRow][newCol] > newCost) {
                        minCost[newRow][newCol] = newCost;
                        pq.offer(new int[] { newCost, newRow, newCol });
                    }
                }
            }
        }

        return minCost[numRows - 1][numCols - 1];
    }
    // TC = O(nm log(nm))
    // SC = O(nm)

    public static void main(String[] args) {
        int[][] grid1 = {{1,1,1,1},{2,2,2,2},{1,1,1,1},{2,2,2,2}};
        System.out.println(minCost(grid1)); // 3

        int[][] grid2 = {{1,1,3},{3,2,2},{1,1,4}};
        System.out.println(minCost(grid2)); // 0

        int[][] grid3 = {{1,2},{4,3}};
        System.out.println(minCost(grid3)); // 1 
    }
}
