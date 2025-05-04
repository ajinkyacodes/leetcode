package M04_April2025;

import java.util.Arrays;

/*
Link: https://leetcode.com/problems/count-the-number-of-fair-pairs/description/
2563. Count the Number of Fair Pairs
 */
public class L250419_Medium2563_Count_the_Number_of_Fair_Pairs {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return lower_bound(nums, upper + 1) - lower_bound(nums, lower);
    }

    // Calculate the number of pairs with sum less than `value`.
    private long lower_bound(int[] nums, int value) {
        int left = 0, right = nums.length - 1;
        long result = 0;
        while (left < right) {
            int sum = nums[left] + nums[right];
            // If sum is less than value, add the size of window to result and move to the
            // next index.
            if (sum < value) {
                result += (right - left);
                left++;
            } else {
                // Otherwise, shift the right pointer backwards, until we get a valid window.
                right--;
            }
        }

        return result;
    }
    // time = O(nlogn)
    // space = O(n) or O(logn)
}
