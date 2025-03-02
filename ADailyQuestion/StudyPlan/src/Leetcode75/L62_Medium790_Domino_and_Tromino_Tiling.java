package Leetcode75;
/*
Link: https://leetcode.com/problems/domino-and-tromino-tiling/description/
790. Domino and Tromino Tiling
 */
public class L62_Medium790_Domino_and_Tromino_Tiling {
    // Approach: Dynamic Programming (Bottom-up, space optimization)
    public int numTilings(int n) {
        int MOD = 1_000_000_007;
        if (n <= 2) {
            return n;
        }
        long fPrevious = 1L;
        long fCurrent = 2L;
        long pCurrent = 1L;
        for (int k = 3; k < n + 1; ++k) {
            long tmp = fCurrent;
            fCurrent = (fCurrent + fPrevious + 2 * pCurrent) % MOD;
            pCurrent = (pCurrent + fPrevious) % MOD;
            fPrevious = tmp;
        }
        return (int) (fCurrent);
    }
    // time = O(n)
    // space = O(1)
}
