package Leetcode75;
/*
Link: https://leetcode.com/problems/increasing-triplet-subsequence/description/
334. Increasing Triplet Subsequence
Topic: Array, Greedy
 */
public class L08_Medium334 {
    public static boolean increasingTriplet(int[] nums) {
        int n = nums.length;

        // If nums array is less than 3 then return false
        if(n<3) return false;

        // Initiating leftMin and rightMax arrays
        int[] leftMin = new int[n];
        int[] rightMax = new int[n];

        // leftMin array for maintaining min values from left to right
        leftMin[0] = nums[0];
        for(int i=1; i<n-1; i++) {
            leftMin[i] = Math.min(leftMin[i-1], nums[i]);
        }

        // rightMax array for maintaining max values from right to left
        rightMax[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], nums[i]);
        }

        // Checking the i<j<k and nums[i] < nums[j] < nums[k] condition
        for(int i=0; i<n; i++) {
            if(leftMin[i] < nums[i] && nums[i] < rightMax[i]) {
                return true;
            }
        }

        return false;
    }
    // TC = O(n)
    // SC = O(n)

    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{1,2,3,4,5})); // true
        System.out.println(increasingTriplet(new int[]{5,4,3,2,1})); // false
        System.out.println(increasingTriplet(new int[]{2,1,5,0,4,6})); // true
        System.out.println(increasingTriplet(new int[]{5,1,6})); // false
        System.out.println(increasingTriplet(new int[]{1,2,2147483647})); // true
    }
}
