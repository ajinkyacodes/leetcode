package M04_April2025;

/*
Link: https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/description/
2873. Maximum Value of an Ordered Triplet I
 */
public class L250402_Easy2873_Maximum_Value_of_an_Ordered_Triplet_I {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long res = 0;
        for (int k = 2; k < n; k++) {
            int maxPrefix = nums[0];
            for (int j = 1; j < k; j++) {
                res = Math.max(res, (long) (maxPrefix - nums[j]) * nums[k]);
                maxPrefix = Math.max(maxPrefix, nums[j]);
            }
        }
        return res;
    }
    // Time complexity: O(n^2).
    // Space complexity: O(1).
}
