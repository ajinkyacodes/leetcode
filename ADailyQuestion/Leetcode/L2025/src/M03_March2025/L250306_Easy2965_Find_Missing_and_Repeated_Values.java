package M03_March2025;
/*
Link: https://leetcode.com/problems/find-missing-and-repeated-values/description/
2965. Find Missing and Repeated Values
 */
import java.util.*;
public class L250306_Easy2965_Find_Missing_and_Repeated_Values {
    // Approach: Hash Map
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int missing = -1, repeat = -1;

        // Store frequency of each number in the grid
        Map<Integer, Integer> freq = new HashMap<>();
        for (int[] row : grid) {
            for (int num : row) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
        }

        // Check numbers from 1 to n^2 to find missing and repeated values
        for (int num = 1; num <= n * n; num++) {
            if (!freq.containsKey(num)) {
                missing = num; // Number not present in grid
            } else if (freq.get(num) == 2) {
                repeat = num; // Number appears twice
            }
        }

        return new int[] { repeat, missing };
    }
    // time = O(n^2)
    // space = O(n^2)
}
