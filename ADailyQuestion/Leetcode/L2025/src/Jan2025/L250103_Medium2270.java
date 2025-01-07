package Jan2025;
/*
Link : https://leetcode.com/problems/number-of-ways-to-split-array/description/
2270. Number of Ways to Split Array
Topics: Array, PrefixSum
Solution: https://www.youtube.com/watch?v=BbbQqETIYqo
 */
public class L250103_Medium2270 {
    public static int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long totalSum = 0;
        // Finding Total Sum
        for(int i=0; i<n; i++){
            totalSum += nums[i];
        }

        // Checking Split Array Count
        int count = 0;
        long prefixSum = 0;
        for(int i=0; i<n-1; i++){
            prefixSum += nums[i];
            if(prefixSum >= totalSum - prefixSum) {
                count++;
            }
        }
        return count;
    }
    // TC = O(N)
    // SC = O(1)

    public static void main(String[] args) {
        int[] nums = {10,4,-8,7}; // 2
        System.out.println(waysToSplitArray(nums));
    }
}
