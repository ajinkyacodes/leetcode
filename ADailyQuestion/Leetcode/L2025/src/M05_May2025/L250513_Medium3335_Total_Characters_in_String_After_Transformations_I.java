package M05_May2025;
/*
Link: https://leetcode.com/problems/total-characters-in-string-after-transformations-i/description/
3335. Total Characters in String After Transformations I
 */
public class L250513_Medium3335_Total_Characters_in_String_After_Transformations_I {
    private static final int MOD = 1000000007;

    public int lengthAfterTransformations(String s, int t) {
        int[] cnt = new int[26];
        for (char ch : s.toCharArray()) {
            ++cnt[ch - 'a'];
        }
        for (int round = 0; round < t; ++round) {
            int[] nxt = new int[26];
            nxt[0] = cnt[25];
            nxt[1] = (cnt[25] + cnt[0]) % MOD;
            for (int i = 2; i < 26; ++i) {
                nxt[i] = cnt[i - 1];
            }
            cnt = nxt;
        }
        int ans = 0;
        for (int i = 0; i < 26; ++i) {
            ans = (ans + cnt[i]) % MOD;
        }
        return ans;
    }
    // time = O(n+t∣Σ∣).
    // space = O(∣Σ∣).
}
