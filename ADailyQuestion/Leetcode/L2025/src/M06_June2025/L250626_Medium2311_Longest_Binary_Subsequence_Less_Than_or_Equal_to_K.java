package M06_June2025;
/*
Link: https://leetcode.com/problems/longest-binary-subsequence-less-than-or-equal-to-k/description/
2311. Longest Binary Subsequence Less Than or Equal to K
 */
public class L250626_Medium2311_Longest_Binary_Subsequence_Less_Than_or_Equal_to_K {
    public int longestSubsequence(String s, int k) {
        int sm = 0;
        int cnt = 0;
        int bits = (int) (Math.log(k) / Math.log(2)) + 1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(s.length() - 1 - i);
            if (ch == '1') {
                if (i < bits && sm + (1 << i) <= k) {
                    sm += 1 << i;
                    cnt++;
                }
            } else {
                cnt++;
            }
        }
        return cnt;
    }
    // time = O(n)
    // space = O(1)
}
