package Easy;
/*
Link: https://leetcode.com/problems/richest-customer-wealth/description/
1672. Richest Customer Wealth
Topics: Array, Matrix
 */
public class Easy1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<m; i++) {
            int sum = 0;
            for(int j=0; j<n; j++) {
                sum += accounts[i][j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts)); // 6
    }
}
