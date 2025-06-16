package M06_June2025;
/*
Link: https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/
2016. Maximum Difference Between Increasing Elements
 */
public class L250616_Easy2016_Maximum_Difference_Between_Increasing_Elements {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int ans = -1, premin = nums[0];
        for (int i = 1; i < n; ++i) {
            if (nums[i] > premin) {
                ans = Math.max(ans, nums[i] - premin);
            } else {
                premin = nums[i];
            }
        }
        return ans;
    }
    // time = O(n).
    // space = O(1).
}
