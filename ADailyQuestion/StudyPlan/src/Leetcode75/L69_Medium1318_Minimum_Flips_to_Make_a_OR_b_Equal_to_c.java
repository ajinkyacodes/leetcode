package Leetcode75;
/*
Link: https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/description/
1318. Minimum Flips to Make a OR b Equal to c
 */
public class L69_Medium1318_Minimum_Flips_to_Make_a_OR_b_Equal_to_c {
    // Approach: Bit Manipulation
    public int minFlips(int a, int b, int c) {
        int answer = 0;
        while (a != 0 | b != 0 | c != 0) {
            if ((c & 1) == 1) {
                if ((a & 1) == 0 && (b & 1) == 0) {
                    answer++;
                }
            } else {
                answer += (a & 1) + (b & 1);
            }

            a >>= 1;
            b >>= 1;
            c >>= 1;
        }

        return answer;
    }
    // time = O(n)
    // space = O(1)
}
