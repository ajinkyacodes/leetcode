package M02_February2025;
/*
Link:
1800. Maximum Ascending Subarray Sum
Topic: Array
 */
public class L250204_Easy1800_Maximum_Ascending_Subarray_Sum {
    public static int maxAscendingSum(int[] nums) {
        int maxSum = 0;
        int currentSubarraySum = nums[0];

        // Loop through the array starting from the second element
        for (int currentIdx = 1; currentIdx < nums.length; ++currentIdx) {
            if (nums[currentIdx] <= nums[currentIdx - 1]) {
                // If the current element is not greater than the previous one,
                // update maxSum
                maxSum = Math.max(maxSum, currentSubarraySum);
                // Reset the sum for the next ascending subarray
                currentSubarraySum = 0;
            }
            currentSubarraySum += nums[currentIdx];
        }

        // Final check after the loop ends to account for the last ascending
        // subarray
        return Math.max(maxSum, currentSubarraySum);
    }
    // time = O(n)
    // space = O(1)

    public static void main(String[] args) {
        System.out.println(maxAscendingSum(new int[]{10,20,30,5,10,50})); // 65
        System.out.println(maxAscendingSum(new int[]{10,20,30,40,50})); // 150
        System.out.println(maxAscendingSum(new int[]{12,17,15,13,10,11,12})); // 33
    }
}
