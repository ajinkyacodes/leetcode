package M03_March2025;
/*
Link: https://www.geeksforgeeks.org/problems/min-cost-climbing-stairs/1
Min Cost Climbing Stairs
 */
public class G250312_Medium_Min_Cost_Climbing_Stairs {
    public int minCostClimbingStairs(int[] cost) {
        int a = cost[0], b = cost[1];
        for (int i = 2; i < cost.length; i++) {
            int temp = b;
            b = cost[i] + Math.min(a, b);
            a = temp;
        }
        return Math.min(a, b);
    }
    // time = O(n)
    // space = O(1)
}
