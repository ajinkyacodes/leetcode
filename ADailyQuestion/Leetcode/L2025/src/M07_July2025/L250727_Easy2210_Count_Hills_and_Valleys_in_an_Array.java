package M07_July2025;
/*
Link: https://leetcode.com/problems/count-hills-and-valleys-in-an-array/description/
2210. Count Hills and Valleys in an Array
 */
public class L250727_Easy2210_Count_Hills_and_Valleys_in_an_Array {
    public int countHillValley(int[] nums) {
        int res = 0; // number of peaks and valleys
        int n = nums.length;
        for (int i = 1; i < n - 1; ++i) {
            if (nums[i] == nums[i - 1]) {
                // deduplication
                continue;
            }
            int left = 0; // left side possibly unequal neighboring corresponding state
            for (int j = i - 1; j >= 0; --j) {
                if (nums[j] > nums[i]) {
                    left = 1;
                    break;
                } else if (nums[j] < nums[i]) {
                    left = -1;
                    break;
                }
            }
            int right = 0; // right side possibly unequal neighboring corresponding state
            for (int j = i + 1; j < n; ++j) {
                if (nums[j] > nums[i]) {
                    right = 1;
                    break;
                } else if (nums[j] < nums[i]) {
                    right = -1;
                    break;
                }
            }
            if (left == right && left != 0) {
                // at this time, index i is part of a peak or valley.
                ++res;
            }
        }
        return res;
    }
    // time = O(n^2)
    // space = O(1)
}
