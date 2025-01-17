package Leetcode75;
/*
Link: https://leetcode.com/problems/max-consecutive-ones-iii/description/
1004. Max Consecutive Ones III
Topic: Sliding Window, Prefix Sum
 */
public class L16_Medium1004_Max_Consecutive_Ones_III {
    public static int longestOnes(int[] nums, int k) {
        int zeroCount = 0;
        int start = 0;
        int maxOnes = 0;

        for(int end=0; end<nums.length; end++) {
            if(nums[end] == 0) {
                zeroCount++;
            }

            while(zeroCount > k) {
                if(nums[start] == 0) {
                    zeroCount--;
                }
                start++;
            }

            maxOnes = Math.max(maxOnes, end - start + 1);
        }
        return maxOnes;
    }
    // TC = O(n)
    // SC = O(1)

    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2)); // 6
        System.out.println(longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3)); // 10
    }
}
