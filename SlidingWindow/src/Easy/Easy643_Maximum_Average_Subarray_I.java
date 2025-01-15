package Easy;
/*
Link: https://leetcode.com/problems/maximum-average-subarray-i/description/
643. Maximum Average Subarray I
Topic: Sliding Window
Solution Explained: https://www.youtube.com/watch?v=56TxHMG0qhQ
 */
public class Easy643_Maximum_Average_Subarray_I {
    public static double findMaxAverage(int[] nums, int k) {

        // Get sum for starting window
        int sum = 0;
        for(int i=0; i<k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Start Sliding Window
        int startIndex = 0;
        int endIndex = k;
        while(endIndex < nums.length) {
            sum -= nums[startIndex]; // Remove prev element
            startIndex++;

            sum += nums[endIndex]; // Add next element
            endIndex++;

            maxSum = Math.max(maxSum, sum);
        }

        // Return the average
        return (double) maxSum/k;
    }
    // TC = O(n)
    // SC = O(1) 

    public static void main(String[] args) {
        int[] nums1 = {1,12,-5,-6,50,3};
        int k1 = 4;
        System.out.println(findMaxAverage(nums1, k1)); // 12.75000
    }
}
