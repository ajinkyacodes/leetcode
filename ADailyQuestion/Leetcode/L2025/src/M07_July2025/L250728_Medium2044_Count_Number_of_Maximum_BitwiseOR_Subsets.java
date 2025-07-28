package M07_July2025;
/*
Link: https://leetcode.com/problems/count-number-of-maximum-bitwise-or-subsets/description/
2044. Count Number of Maximum Bitwise-OR Subsets
 */
public class L250728_Medium2044_Count_Number_of_Maximum_BitwiseOR_Subsets {
    //Approach : Bit Manipulation + Dynamic Programming
    public int countMaxOrSubsets(int[] nums) {
        int max = 0;
        int[] dp = new int[1 << 17];

        // Initialize the empty subset
        dp[0] = 1;

        // Iterate through each number in the input array
        for (int num : nums) {
            for (int i = max; i >= 0; i--) {
                // For each existing subset, create a new subset by including the current number
                dp[i | num] += dp[i];
            }
            // Update the maximum OR value
            max |= num;
        }

        return dp[max];
    }
    // time = O(n.max)
    // space = O(2^17)
}
