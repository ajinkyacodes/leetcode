package M01_January2025;
/*
Link: https://leetcode.com/problems/grid-game/description/
2017. Grid Game
Topics: Array, Matrix, Prefix Sum
Similar Solution Explained = https://youtu.be/qA7yyNI2xKM
 */
public class L250121_Medium2017_Grid_Game {
    public static long gridGame(int[][] grid) {
        // Calculate the sum of all the elements for the first row
        long firstRowSum = 0;
        for(int num : grid[0]) {
            firstRowSum += num;
        }
        long secondRowSum = 0;
        long minimumSum = Long.MAX_VALUE;
        for(int turnIndex = 0; turnIndex < grid[0].length; turnIndex++) {
            firstRowSum -= grid[0][turnIndex];
            // Find the minimum maximum value of the firstRowSum and secondRowSum
            minimumSum = Math.min(
                    minimumSum,
                    Math.max(firstRowSum, secondRowSum)
            );
            secondRowSum += grid[1][turnIndex];
        }
        return minimumSum;
    }
    // Time = O(n)
    // Space = O(1)

    public static void main(String[] args) {
        System.out.println(gridGame(new int[][]{{2,5,4},{1,5,1}})); // 4
        System.out.println(gridGame(new int[][]{{3,3,1},{8,5,2}})); // 4
        System.out.println(gridGame(new int[][]{{1,3,1,15},{1,3,3,1}})); // 7
    }
}
