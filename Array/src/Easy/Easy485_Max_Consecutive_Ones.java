package Easy;
/*
Link: https://leetcode.com/problems/max-consecutive-ones/description/
485. Max Consecutive Ones
 */
public class Easy485_Max_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxSum = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
            if(nums[i]==0) sum = 0;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    // TC = O(n)
    // SC = O(1)

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1})); // 3
        System.out.println(findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1})); // 2
    }
}
