package Pro;
/*
Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
121. Best Time to Buy and Sell Stock
FAANG : Apple
*/
public class Pro121_Best_Time_to_Buy_and_Sell_Stock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices) {
            if(price < minPrice) {
                minPrice = price;
            } else if(price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
    // TC = O(N)
    // SC = O(1)

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
