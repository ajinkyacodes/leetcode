package M06_June2025;
/*
Link: https://leetcode.com/problems/distribute-candies-among-children-iii/description/
2927. Distribute Candies Among Children III
 */
public class L2506_W1_Hard2927_Distribute_Candies_Among_Children_III {
    public long distributeCandies(int n, int limit) {
        return (
                cal(n + 2) -
                        3 * cal(n - limit + 1) +
                        3 * cal(n - (limit + 1) * 2 + 2) -
                        cal(n - 3 * (limit + 1) + 2)
        );
    }

    public long cal(int x) {
        if (x < 0) {
            return 0;
        }
        return ((long) x * (x - 1)) / 2;
    }
    // time = O(1).
    // space = O(1).
}
