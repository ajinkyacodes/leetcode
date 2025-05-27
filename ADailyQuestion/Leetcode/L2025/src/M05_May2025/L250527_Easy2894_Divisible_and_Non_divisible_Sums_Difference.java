package M05_May2025;
/*
Link: https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/
2894. Divisible and Non-divisible Sums Difference
 */
public class L250527_Easy2894_Divisible_and_Non_divisible_Sums_Difference {
    public int differenceOfSums(int n, int m) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                ans -= i;
            } else {
                ans += i;
            }
        }
        return ans;
    }
    // time = O(n)
    // space = O(1)
}
