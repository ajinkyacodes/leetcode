package M03_March2025;
/*
Link: https://www.geeksforgeeks.org/problems/longest-palindrome-in-a-string3411/1
Longest Palindrome in a String
 */
public class G250308_Medium_Longest_Palindrome_in_a_String {
    static String longestPalindrome(String s) {
        int n = s.length(), start = 0, maxLen = 0;
        for (int i = 0; i < n; i++)
            for (int l : new int[]{i, i + 1}) {
                int j = i;
                while (j >= 0 && l < n && s.charAt(j) == s.charAt(l)) {
                    j--;
                    l++;
                }
                if (l - j - 1 > maxLen) {
                    start = j + 1;
                    maxLen = l - j - 1;
                }
            }
        return s.substring(start, start + maxLen);
    }
    // time = O(n^2)
    // space = O(1)
}
