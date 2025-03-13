package Leetcode75;
/*
Link: https://leetcode.com/problems/non-overlapping-intervals/description/
435. Non-overlapping Intervals
 */
import java.util.*;
public class L72_Medium435_Non_overlapping_Intervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int ans = 0;
        int k = Integer.MIN_VALUE;

        for (int i = 0; i < intervals.length; i++) {
            int x = intervals[i][0];
            int y = intervals[i][1];

            if (x >= k) {
                // Case 1
                k = y;
            } else {
                // Case 2
                ans++;
            }
        }

        return ans;
    }
    // time = O(n log n)
    // space = O(n)
}
