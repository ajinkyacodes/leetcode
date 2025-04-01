package M04_April2025;

/*
    Link: https://leetcode.com/problems/solving-questions-with-brainpower/description/
    2140. Solving Questions With Brainpower
 */
public class L250401_Medium2140_Solving_Questions_With_Brainpower {
    // Approach 1: Dynamic Programming (Iterative)
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n];
        dp[n - 1] = questions[n - 1][0];

        for (int i = n - 2; i >= 0; --i) {
            dp[i] = questions[i][0];
            int skip = questions[i][1];
            if (i + skip + 1 < n) {
                dp[i] += dp[i + skip + 1];
            }

            // dp[i] = max(solve it, skip it)
            dp[i] = Math.max(dp[i], dp[i + 1]);
        }

        return dp[0];
    }
    // time = O(n)
    // space = O(n)\
}
