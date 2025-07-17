package M07_July2025;
/*
Link: https://leetcode.com/problems/find-the-maximum-length-of-valid-subsequence-ii/description/
3202. Find the Maximum Length of Valid Subsequence II
 */
public class L250717_Medium3202_Find_the_Maximum_Length_of_Valid_Subsequence_II {
    public int maximumLength(int[] nums, int k) {
        int[][] dp = new int[k][k];
        int res = 0;
        for(int num: nums) {
            num %= k;
            for(int prev = 0; prev < k; prev++) {
                dp[prev][num] = dp[num][prev] + 1;
                res = Math.max(res, dp[prev][num]);
            }
        }
        return res;
    }
    // time = O(k^2 + n * k)
    // space = O(k^2)
}
