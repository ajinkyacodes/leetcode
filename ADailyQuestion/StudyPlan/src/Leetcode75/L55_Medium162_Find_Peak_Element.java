package Leetcode75;
/*
Link: https://leetcode.com/problems/find-peak-element/description/
162. Find Peak Element
 */
public class L55_Medium162_Find_Peak_Element {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1]) r = mid;
            else l = mid + 1;
        }
        return l;
    }
    // time = O(log(n))
    // space = O(1)
}
