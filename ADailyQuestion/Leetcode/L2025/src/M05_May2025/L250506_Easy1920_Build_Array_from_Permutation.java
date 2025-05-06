package M05_May2025;
/*
Link: https://leetcode.com/problems/build-array-from-permutation/description/
1920. Build Array from Permutation
 */
public class L250506_Easy1920_Build_Array_from_Permutation {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; ++i) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    // time = O(n)
    // space = O(1)
}
