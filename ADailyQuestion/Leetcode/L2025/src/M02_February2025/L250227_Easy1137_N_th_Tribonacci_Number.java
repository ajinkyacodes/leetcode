package M02_February2025;
/*
Link: https://leetcode.com/problems/n-th-tribonacci-number/description/
1137. N-th Tribonacci Number
Approach: Better Dynamic Programming (Bottom Up)
 */
public class L250227_Easy1137_N_th_Tribonacci_Number {
    public int tribonacci(int n) {
        if (n < 3) {
            return n > 0 ? 1 : 0;
        }

        int a = 0, b = 1, c = 1;
        for (int i = 0; i < n - 2; ++i) {
            int tmp = a + b + c;
            a = b;
            b = c;
            c = tmp;
        }

        return c;
    }
    // time = O(n)
    // space = O(1)
}
