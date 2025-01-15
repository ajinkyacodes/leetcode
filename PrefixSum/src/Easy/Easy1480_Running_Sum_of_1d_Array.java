package Easy;
/*
Link: https://leetcode.com/problems/running-sum-of-1d-array/description/
1480. Running Sum of 1d Array
Topic: Array, Prefix Sum
 */
public class Easy1480_Running_Sum_of_1d_Array {
    public static int[] runningSum(int[] nums) {
        // Prefix Sum Approach
        for(int i=1; i<nums.length; i++) {
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }
    // TC = O(N)
    // SC = O(1)

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = runningSum(nums);
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i]+" "); // [1,3,6,10]
        }
    }
}
