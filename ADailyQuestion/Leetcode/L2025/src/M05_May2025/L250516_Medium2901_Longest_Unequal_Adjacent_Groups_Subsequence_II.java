package M05_May2025;
/*
Link: https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-ii/description/
2901. Longest Unequal Adjacent Groups Subsequence II
 */
import java.util.*;
public class L250516_Medium2901_Longest_Unequal_Adjacent_Groups_Subsequence_II {
    public List<String> getWordsInLongestSubsequence(
            String[] words,
            int[] groups
    ) {
        int n = groups.length;
        int[] dp = new int[n];
        int[] prev = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (
                        check(words[i], words[j]) &&
                                dp[j] + 1 > dp[i] &&
                                groups[i] != groups[j]
                ) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > dp[maxIndex]) {
                maxIndex = i;
            }
        }
        List<String> ans = new ArrayList<>();
        for (int i = maxIndex; i >= 0; i = prev[i]) {
            ans.add(words[i]);
        }
        Collections.reverse(ans);
        return ans;
    }

    private boolean check(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int diff = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (++diff > 1) {
                    return false;
                }
            }
        }
        return diff == 1;
    }
    // time = O(n^2L)
    // space = O(n)
}
