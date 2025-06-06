package M04_April2025;
/*
Link: https://leetcode.com/problems/count-subarrays-with-fixed-bounds/description/
2444. Count Subarrays With Fixed Bounds
 */
public class L250426_Hard2444_Count_Subarrays_With_Fixed_Bounds {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        // minPosition, maxPosition: the MOST RECENT positions of minK and maxK.
        // leftBound: the MOST RECENT value outside the range [minK, maxK].
        long answer = 0;
        int minPosition = -1, maxPosition = -1, leftBound = -1;

        // Iterate over nums, for each number at index i:
        for (int i = 0; i < nums.length; ++i) {
            // If the number is outside the range [minK, maxK], update the most recent leftBound.
            if (nums[i] < minK || nums[i] > maxK)
                leftBound = i;

            // If the number is minK or maxK, update the most recent position.
            if (nums[i] == minK)
                minPosition = i;
            if (nums[i] == maxK)
                maxPosition = i;

            // The number of valid subarrays equals the number of elements between leftBound and
            // the smaller of the two most recent positions (minPosition and maxPosition).
            answer += Math.max(0, Math.min(maxPosition, minPosition) - leftBound);
        }
        return answer;
    }
    // time = O(n)
    // space = O(1)
}
