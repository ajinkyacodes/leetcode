package Leetcode75;
/*
Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/
714. Best Time to Buy and Sell Stock with Transaction Fee
 */
public class L65_Medium714_Best_Time_to_Buy_and_Sell_Stock_with_Transaction_Fee {
    // Approach: Space-Optimized Dynamic Programming
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int free = 0, hold = -prices[0];

        for (int i = 1; i < n; i++) {
            int tmp = hold;
            hold = Math.max(hold, free - prices[i]);
            free = Math.max(free, tmp + prices[i] - fee);
        }

        return free;
    }
    // time = O(n)
    // space = O(1)
}
