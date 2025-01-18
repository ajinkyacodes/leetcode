package BiweeklyContest148;
/*
Link: https://leetcode.com/contest/biweekly-contest-148/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/description/
Q1. Maximum Difference Between Adjacent Elements in a Circular Array
 */
public class Easy3423_Maximum_Difference_Between_Adjacent_Elements_in_a_Circular_Array {
    public static int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int maxDiff = 0;
        int j = 0;
        for(int i=1; i<n; i++){
            if(j < n-1) {
                int diff = Math.abs(nums[i]-nums[j]);
                j++;
                maxDiff = Math.max(maxDiff, diff);
            }
        }
        int adjDiff = Math.abs(nums[n-1] - nums[0]);
        return Math.max(maxDiff, adjDiff);
    }
    // TC = O(n)
    // SC = O(1)

    public static void main(String[] args) {
        int[] nums1 = {1,2,4};
        System.out.println(maxAdjacentDistance(nums1)); // 3

        int[] nums2 = {-5,-10,-5};
        System.out.println(maxAdjacentDistance(nums2)); // 5
    }
}
