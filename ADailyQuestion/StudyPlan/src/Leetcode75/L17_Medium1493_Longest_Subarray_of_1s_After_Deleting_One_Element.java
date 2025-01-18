package Leetcode75;
/*
Link: https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/
1493. Longest Subarray of 1's After Deleting One Element
Topics: Sliding Window
 */
public class L17_Medium1493_Longest_Subarray_of_1s_After_Deleting_One_Element {
    public static int longestSubarray(int[] nums) {
        int n = nums.length;
        int zeroCount = 0;
        int longestWindow = 0;
        // Left end of the window
        int start = 0;

        for(int i=0; i<n; i++) {
            zeroCount += (nums[i] == 0 ? 1 : 0);

            // Shrink the window until count of zeros is less than or equal to 1
            while(zeroCount > 1) {
                zeroCount -= (nums[start] == 0 ? 1 : 0);
                start++;
            }

            longestWindow = Math.max(longestWindow, i-start);
        }
        return longestWindow;
    }
    // TC = O(n)
    // SC = O(1)

    public static void main(String[] args) {
        int[] nums1 = {1,1,0,1};
        System.out.println(longestSubarray(nums1)); // 3

        int[] nums2 = {0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarray(nums2)); // 5

        int[] nums3 = {1,1,1};
        System.out.println(longestSubarray(nums3)); // 2
    }
}
