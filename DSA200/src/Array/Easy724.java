package Array;
/*
Link : https://leetcode.com/problems/find-pivot-index/description/
724. Find Pivot Index
Topics: String, PrefixSum
Solution: https://www.youtube.com/watch?v=VlI3Rg9NnMk
 */

public class Easy724 {
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
    // TC = O(N)
    // SC = O(1)

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6})); // 3
        System.out.println(pivotIndex(new int[]{1,2,3})); // -1
        System.out.println(pivotIndex(new int[]{2,1,-1})); // 0
    }
}
