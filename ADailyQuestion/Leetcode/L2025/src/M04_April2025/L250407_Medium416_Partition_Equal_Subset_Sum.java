package M04_April2025;

/*
Link: https://leetcode.com/problems/partition-equal-subset-sum/description/
416. Partition Equal Subset Sum
 */
public class L250407_Medium416_Partition_Equal_Subset_Sum {
    // Approach 4: Optimised Dynamic Programming - Using 1D Array
    public boolean canPartition(int[] nums) {
        if (nums.length == 0)
            return false;
        int totalSum = 0;
        // find sum of all array elements
        for (int num : nums) {
            totalSum += num;
        }
        // if totalSum is odd, it cannot be partitioned into equal sum subset
        if (totalSum % 2 != 0) return false;
        int subSetSum = totalSum / 2;
        boolean dp[] = new boolean[subSetSum + 1];
        dp[0] = true;
        for (int curr : nums) {
            for (int j = subSetSum; j >= curr; j--) {
                dp[j] |= dp[j - curr];
            }
        }
        return dp[subSetSum];
    }
    // time = O(m⋅n)
    // space = O(m)
}
