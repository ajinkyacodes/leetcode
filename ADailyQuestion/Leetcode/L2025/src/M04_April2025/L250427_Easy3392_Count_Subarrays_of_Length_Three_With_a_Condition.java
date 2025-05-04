package M04_April2025;
/*
Link: https://leetcode.com/problems/count-subarrays-of-length-three-with-a-condition/description/
3392. Count Subarrays of Length Three With a Condition
 */
public class L250427_Easy3392_Count_Subarrays_of_Length_Three_With_a_Condition {
    public int countSubarrays(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 1; i < n - 1; ++i) {
            if (nums[i] == (nums[i - 1] + nums[i + 1]) * 2) {
                ++ans;
            }
        }
        return ans;
    }
    // time = O(n)
    // space = O(1)
}
