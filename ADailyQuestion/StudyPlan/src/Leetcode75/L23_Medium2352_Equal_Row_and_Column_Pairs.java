package Leetcode75;
/*
Link: https://leetcode.com/problems/equal-row-and-column-pairs/description/
2352. Equal Row and Column Pairs
Topic: Hash Table, Matrix
 */
import java.util.*;
public class L23_Medium2352_Equal_Row_and_Column_Pairs {
    public static int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;

        // Track frequency of each row
        Map<String, Integer> rowCounter = new HashMap<>();
        for(int[] row: grid) {
            String rowString = Arrays.toString(row);
            rowCounter.put(rowString, rowCounter.getOrDefault(rowString,0)+1);
        }

        // Add up the frequency of each column in map
        for(int c=0; c<n; c++){
            int[] colArray = new int[n];
            for(int r=0; r<n; r++){
                colArray[r] = grid[r][c];
            }
            count += rowCounter.getOrDefault(Arrays.toString(colArray),0);
        }

        return count;
    }
    // Time = O(n^2)
    // Space = O(n^2)

    public static void main(String[] args) {
        int[][] grid1 = {{3,2,1},{1,7,6},{2,7,7}};
        int[][] grid2 = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        System.out.println(equalPairs(grid1)); // 1
        System.out.println(equalPairs(grid2)); // 3
    }
}
