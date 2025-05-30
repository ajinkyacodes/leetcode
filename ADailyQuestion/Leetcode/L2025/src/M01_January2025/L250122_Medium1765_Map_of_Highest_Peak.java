package M01_January2025;
/*
Link: https://leetcode.com/problems/map-of-highest-peak/description/
1765. Map of Highest Peak
Topics: Breadth First Search, Matrix
 */
import java.util.*;
public class L250122_Medium1765_Map_of_Highest_Peak {
    public static int[][] highestPeak(int[][] isWater) {
        int[] dx = { 0, 0, 1, -1 }; // Horizontal movement: right, left, down, up
        int[] dy = { 1, -1, 0, 0 }; // Vertical movement corresponding to dx

        int rows = isWater.length;
        int columns = isWater[0].length;

        // Initialize the height matrix with -1 (unprocessed cells)
        int[][] cellHeights = new int[rows][columns];
        for (int[] row : cellHeights) {
            Arrays.fill(row, -1);
        }

        // Queue to perform breadth-first search
        Queue<int[]> cellQueue = new LinkedList<>();

        // Add all water cells to the queue and set their height to 0
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < columns; y++) {
                if (isWater[x][y] == 1) {
                    cellQueue.add(new int[] { x, y });
                    cellHeights[x][y] = 0;
                }
            }
        }

        int heightOfNextLayer = 1; // Initial height for land cells adjacent to water

        // Perform BFS
        while (!cellQueue.isEmpty()) {
            int layerSize = cellQueue.size();

            // Iterate through all cells in the current layer
            for (int i = 0; i < layerSize; i++) {
                int[] currentCell = cellQueue.poll();

                // Check all four possible directions for neighboring cells
                for (int d = 0; d < 4; d++) {
                    int neighborX = currentCell[0] + dx[d];
                    int neighborY = currentCell[1] + dy[d];

                    // Check if the neighbor is valid and unprocessed
                    if (
                            isValidCell(neighborX, neighborY, rows, columns) &&
                                    cellHeights[neighborX][neighborY] == -1
                    ) {
                        cellHeights[neighborX][neighborY] = heightOfNextLayer;
                        cellQueue.add(new int[] { neighborX, neighborY });
                    }
                }
            }
            heightOfNextLayer++; // Increment height for the next layer
        }

        return cellHeights;
    }
    // Time = O(rows * columns)
    // Space = O(rows * columns)

    // Function to check if a cell is within the grid boundaries
    private static boolean isValidCell(int x, int y, int rows, int columns) {
        return x >= 0 && y >= 0 && x < rows && y < columns;
    }

    public static void main(String[] args) {
        int[][] isWater1 = {{0,1},{0,0}};
        System.out.println(Arrays.deepToString(highestPeak(isWater1))); // [[1,0],[2,1]]

        int[][] isWater2 = {{0,0,1},{1,0,0}, {0,0,0}};
        System.out.println(Arrays.deepToString(highestPeak(isWater2))); // [[1,1,0],[0,1,1],[1,2,2]]
    }
}
