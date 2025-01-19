package WeeklyContest433;
/*
Q1. Sum of Variable Length Subarrays
 */
public class Easy_Sum_of_Variable_Length_Subarrays {
    public static int subarraySum(int[] nums) {
        int n = nums.length;
        int totalSum = 0;

        for(int i=0; i<n; i++) {
            int start = Math.max(0, i - nums[i]);

            for(int j=start; j<=i; j++) {
                totalSum += nums[j];
            }
        }
        return totalSum;
    }
    // TC = O(n^2)
    // SC = O(1)

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{2,3,1})); // 11
        System.out.println(subarraySum(new int[]{3,1,1,2})); // 13
    }
}
