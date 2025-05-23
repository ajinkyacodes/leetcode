package M02_February2025;
/*
Link: https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/description/
3105. Longest Strictly Increasing or Strictly Decreasing Subarray
Topic: Array
 */
public class L250203_Easy3105_Longest_Strictly_Increasing_or_Strictly_Decreasing_Subarray {
    public static int longestMonotonicSubarray(int[] nums) {
        // Track current lengths of increasing and decreasing sequences
        int incLength = 1, decLength = 1;
        int maxLength = 1;

        // Iterate through array comparing adjacent elements
        for (int pos = 0; pos < nums.length - 1; pos++) {
            if (nums[pos + 1] > nums[pos]) {
                // If next element is larger, extend increasing sequence
                incLength++;
                decLength = 1; // Reset decreasing sequence
            } else if (nums[pos + 1] < nums[pos]) {
                // If next element is smaller, extend decreasing sequence
                decLength++;
                incLength = 1; // Reset increasing sequence
            } else {
                // If elements are equal, reset both sequences
                incLength = 1;
                decLength = 1;
            }

            // Update max length considering both sequences
            maxLength = Math.max(maxLength, Math.max(incLength, decLength));
        }
        return maxLength;
    }
    // time = O(n)
    // space = O(1)

    public static void main(String[] args) {
        System.out.println(longestMonotonicSubarray(new int[]{1,4,3,3,2})); // 2
        System.out.println(longestMonotonicSubarray(new int[]{3,3,3,3})); // 1
        System.out.println(longestMonotonicSubarray(new int[]{3,2,1})); // 3
    }
}
