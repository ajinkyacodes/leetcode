package Leetcode75;
/*
Link: https://leetcode.com/problems/min-cost-climbing-stairs/description/
746. Min Cost Climbing Stairs

Approach: Bottom-Up, Constant Space
 */
public class L60_Easy746_Min_Cost_Climbing_Stairs {
    public int minCostClimbingStairs(int[] cost) {
        int downOne = 0;
        int downTwo = 0;
        for (int i = 2; i < cost.length + 1; i++) {
            int temp = downOne;
            downOne = Math.min(downOne + cost[i - 1], downTwo + cost[i - 2]);
            downTwo = temp;
        }

        return downOne;
    }
    // time = O(n)
    // space = O(1)
}
