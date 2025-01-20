package Medium;
/*
Link: https://leetcode.com/problems/first-completely-painted-row-or-column/description/
2661. First Completely Painted Row or Column
Topics: Hash Table, Matrix
 */

import java.util.HashMap;
import java.util.Map;

public class Medium2661_First_Completely_Painted_Row_or_Column {
    public static int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        // Step 1: Create a lookup table for each value in the matrix
        Map<Integer, int[]> lookup = new HashMap<>(); // Stores x,y coordinates for each element
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                lookup.put(mat[i][j], new int[]{i,j});
            }
        }

        // Step 2: Find the earliest row or column painted
        int[] rowCount = new int[m];
        int[] colCount = new int[n];

        for(int i=0; i<arr.length; i++) {
            int[] coordinate = lookup.get(arr[i]);
            int x = coordinate[0];
            int y = coordinate[1];

            rowCount[x]++;
            colCount[y]++;
            if(rowCount[x]==n || colCount[y]==m) {
                return i;
            }
        }
        return 0;
    }
    // TC = O(m * n)
    // SC = O(m * n)

    public static void main(String[] args) {
        int[] arr1 = {1,3,4,2};
        int[][] mat1 = {{1,4},{2,3}};
        System.out.println(firstCompleteIndex(arr1, mat1)); // 2

        int[] arr2 = {2,8,7,4,1,3,5,6,9};
        int[][] mat2 = {{3,2,5},{1,4,6},{8,7,9}};
        System.out.println(firstCompleteIndex(arr2, mat2)); // 3
    }
}
