package M03_March2025;
/*
Link: https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1
0 - 1 Knapsack Problem
 */
public class G250313_Medium_0_1_Knapsack_Problem {
    static int knapsack(int W, int[] val, int[] wt) {
        int[] dp = new int[W + 1];
        for (int i = 0; i < wt.length; i++)
            for (int j = W; j >= wt[i]; j--)
                dp[j] = Math.max(dp[j], val[i] + dp[j - wt[i]]);
        return dp[W];
    }
    // time = O(n * W)
    // space = O(W)
}
