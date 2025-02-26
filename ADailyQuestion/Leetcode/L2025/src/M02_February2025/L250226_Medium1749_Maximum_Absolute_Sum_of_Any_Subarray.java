package M02_February2025;
/*
Link: https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/description/
1749. Maximum Absolute Sum of Any Subarray
 */
public class L250226_Medium1749_Maximum_Absolute_Sum_of_Any_Subarray {
    // Approach: Greedy - Prefix Sum
    public int maxAbsoluteSum(int[] nums) {
        int minPrefixSum = Integer.MAX_VALUE, maxPrefixSum = Integer.MIN_VALUE;
        int prefixSum = 0, maxAbsSum = 0;

        for (int i = 0; i < nums.length; i++) {
            // Prefix sum from index 0 to i
            prefixSum += nums[i];

            // Minimum & Maximum prefix sum we have seen so far
            minPrefixSum = Math.min(minPrefixSum, prefixSum);
            maxPrefixSum = Math.max(maxPrefixSum, prefixSum);

            if (prefixSum >= 0) {
                // If the prefixSum is positive, we will get the difference between prefixSum &
                // minPrefixSum
                maxAbsSum = Math.max(
                        maxAbsSum,
                        Math.max(prefixSum, prefixSum - minPrefixSum)
                );
            } else if (prefixSum <= 0) {
                // If the prefixSum is negative, we will get the absolute difference between
                // prefixSum & maxPrefixSum
                maxAbsSum = Math.max(
                        maxAbsSum,
                        Math.max(
                                Math.abs(prefixSum),
                                Math.abs(prefixSum - maxPrefixSum)
                        )
                );
            }
        }

        return maxAbsSum;
    }
    // time = O(n)
    // space = O(1)
}
