package M04_April2025;

/*
Link: https://leetcode.com/problems/count-good-numbers/description/
1922. Count Good Numbers
 */
public class L250413_Medium1922_Count_Good_Numbers {
    long mod = 1000000007;

    public int countGoodNumbers(long n) {
        return (int) ((quickmul(5, (n + 1) / 2) * quickmul(4, n / 2)) % mod);
    }

    // use fast exponentiation to calculate x^y % mod
    public long quickmul(int x, long y) {
        long ret = 1;
        long mul = x;
        while (y > 0) {
            if (y % 2 == 1) {
                ret = (ret * mul) % mod;
            }
            mul = (mul * mul) % mod;
            y /= 2;
        }

        return ret;
    }
    // time = O(logn)
    // space = O(1)
}
