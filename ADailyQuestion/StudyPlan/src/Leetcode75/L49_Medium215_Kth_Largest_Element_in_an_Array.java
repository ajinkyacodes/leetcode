package Leetcode75;
/*
Link: https://leetcode.com/problems/kth-largest-element-in-an-array/description/
215. Kth Largest Element in an Array
Approach: Counting Sort
 */
public class L49_Medium215_Kth_Largest_Element_in_an_Array {
    public int findKthLargest(int[] nums, int k) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int num: nums) {
            minValue = Math.min(minValue, num);
            maxValue = Math.max(maxValue, num);
        }

        int[] count = new int[maxValue - minValue + 1];
        for (int num: nums) {
            count[num - minValue]++;
        }

        int remain = k;
        for (int num = count.length - 1; num >= 0; num--) {
            remain -= count[num];
            if (remain <= 0) {
                return num + minValue;
            }
        }

        return -1;
    }
    // Time complexity: O(n+m)
    // Space complexity: O(m)
}
