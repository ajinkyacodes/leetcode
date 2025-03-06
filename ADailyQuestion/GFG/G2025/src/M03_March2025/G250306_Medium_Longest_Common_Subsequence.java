package M03_March2025;
/*
Link: https://www.geeksforgeeks.org/problems/longest-common-subsequence-1587115620/1
Longest Common Subsequence
 */
public class G250306_Medium_Longest_Common_Subsequence {
    static int lcs(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int[] prev = new int[m + 1], curr = new int[m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                curr[j] = s1.charAt(i - 1) == s2.charAt(j - 1) ? prev[j - 1] + 1 : Math.max(prev[j], curr[j - 1]);
            }
            int[] temp = prev; prev = curr; curr = temp;
        }
        return prev[m];
    }
    // time = O(n * m)
    // space = O(m)
}
