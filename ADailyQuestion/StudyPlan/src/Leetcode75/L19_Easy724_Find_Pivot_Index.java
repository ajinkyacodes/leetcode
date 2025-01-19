package Leetcode75;
/*
Link: https://leetcode.com/problems/find-pivot-index/description/
724. Find Pivot Index
Topic: Prefix Sum
 */
public class L19_Easy724_Find_Pivot_Index {
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int totalSum = 0;

        // Calculating Total Sum
        for(int i=0; i<n; i++) {
            totalSum += nums[i];
        }

        int leftSum = 0;
        int rightSum = totalSum;

        // Traversing to compare left and right sum
        for(int i=0; i<n; i++){
            rightSum -= nums[i];
            if(leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
    // TC = O(n)
    // SC = O(1)

    public static void main(String[] args) {
        int[] nums1 = {1,7,3,6,5,6};
        int[] nums2 = {1,2,3};
        int[] nums3 = {2,1,-1};
        System.out.println(pivotIndex(nums1)); // 3
        System.out.println(pivotIndex(nums2)); // -1
        System.out.println(pivotIndex(nums3)); // 0
    }
}
