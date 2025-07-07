package Easy;
/*
Link: https://leetcode.com/problems/counting-bits/description/
338. Counting Bits
 */
public class Easy338_Counting_Bits {
    // Approach: DP + Last Set Bit
    public int[] countBits(int num) {
        int[] ans = new int[num + 1];
        for (int x = 1; x <= num; ++x) {
            ans[x] = ans[x & (x - 1)] + 1;
        }
        return ans;
    }
    // time = O(n)
    // space = O(1)
}
