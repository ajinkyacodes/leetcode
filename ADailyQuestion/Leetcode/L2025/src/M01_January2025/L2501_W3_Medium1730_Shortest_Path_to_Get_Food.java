package M01_January2025;
/*
Link:
1730. Shortest Path to Get Food
Topic: Matrix, BFS
 */

import java.util.*;

public class L2501_W3_Medium1730_Shortest_Path_to_Get_Food {
    // Direction vectors for up, down, left, right movement
    private static final int[][] dirs = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

    public static int getFood(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[] start = {-1, -1};
        List<int[]> foods = new ArrayList<>();

        // Find starting position and all food locations
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '*') {
                    start = new int[]{r, c};
                } else if (grid[r][c] == '#') {
                    foods.add(new int[]{r, c});
                }
            }
        }

        if (foods.isEmpty()) {
            return -1;
        }

        // Track visited cells to avoid cycles
        boolean[][] seen = new boolean[rows][cols];

        // Priority queue stores: [estimated total cost, steps taken, row, col]
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        // Calculate initial Manhattan distance estimate to nearest food
        int initCost = calcDist(start[0], start[1], foods);
        pq.add(new int[]{initCost, 0, start[0], start[1]});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int estCost = curr[0];
            int steps = curr[1];
            int r = curr[2];
            int c = curr[3];

            // Try all four directions
            for (int[] d : dirs) {
                int newR = r + d[0];
                int newC = c + d[1];

                if (!isValid(grid, newR, newC) || seen[newR][newC]) {
                    continue;
                }

                // If food found, return total steps taken
                if (grid[newR][newC] == '#') {
                    return steps + 1;
                } else {
                    seen[r][c] = true;
                    // Calculate new Manhattan distance estimate
                    int newEst = calcDist(newR, newC, foods);
                    pq.add(new int[]{newEst, steps + 1, newR, newC});
                }
            }
        }

        return -1;
    }

    // Calculate Manhattan distance to nearest food
    private static int calcDist(int r, int c, List<int[]> foods) {
        int minDist = Integer.MAX_VALUE;
        for (int[] food : foods) {
            int dist = Math.abs(food[0] - r) + Math.abs(food[1] - c);
            minDist = Math.min(minDist, dist);
        }
        return minDist;
    }

    // Check if position is within grid bounds and not an obstacle
    private static boolean isValid(char[][] grid, int r, int c) {
        return (
                r >= 0 &&
                        c >= 0 &&
                        r < grid.length &&
                        c < grid[0].length &&
                        grid[r][c] != 'X'
        );
    }

    public static void main(String[] args) {
        char[][] grid1 = {{'X', 'X', 'X', 'X', 'X', 'X'}, {'X', '*', 'O', 'O', 'O', 'X'}, {'X', 'O', 'O', '#', 'O', 'X'}, {'X', 'X', 'X', 'X', 'X', 'X'}};
        System.out.println(getFood(grid1)); // 3

        char[][] grid2 = {{'X','X','X','X','X'},{'X','*','X','O','X'},{'X','O','X','#','X'},{'X','X','X','X','X'}};
        System.out.println(getFood(grid2)); // -1

        char[][] grid3 = {{'X','X','X','X','X','X','X','X'},{'X','*','O','X','O','#','O','X'},{'X','O','O','X','O','O','X','X'},{'X','O','O','O','O','#','O','X'},{'X','X','X','X','X','X','X','X'}};
        System.out.println(getFood(grid3)); // 6
    }
}
