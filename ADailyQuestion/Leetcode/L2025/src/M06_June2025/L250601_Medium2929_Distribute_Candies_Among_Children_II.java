package M06_June2025;
/*
Link: https://leetcode.com/problems/distribute-candies-among-children-ii/description/
2929. Distribute Candies Among Children II
 */
public class L250601_Medium2929_Distribute_Candies_Among_Children_II {
    public long distributeCandies(int n, int limit) {
        long ans = 0;
        for (int i = 0; i <= Math.min(limit, n); i++) {
            if (n - i > 2 * limit) {
                continue;
            }
            ans += Math.min(n - i, limit) - Math.max(0, n - i - limit) + 1;
        }
        return ans;
    }
    // time = O(min(limit,n)).
    // space = O(1).
}
