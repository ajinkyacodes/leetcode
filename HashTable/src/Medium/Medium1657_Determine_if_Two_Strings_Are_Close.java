package Medium;
/*
Link: https://leetcode.com/problems/determine-if-two-strings-are-close/description/
1657. Determine if Two Strings Are Close
Topic: String, Hash Table, Sorting, Counting
 */

import java.util.Arrays;

public class Medium1657_Determine_if_Two_Strings_Are_Close {
    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int word1Map[] = new int[26];
        int word2Map[] = new int[26];
        for (char c : word1.toCharArray()) {
            word1Map[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            word2Map[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if ((word1Map[i] == 0 && word2Map[i] > 0) ||
                    (word2Map[i] == 0 && word1Map[i] > 0)) {
                return false;
            }
        }
        Arrays.sort(word1Map);
        Arrays.sort(word2Map);
        return Arrays.equals(word1Map, word2Map);
    }
    // Time = O(n)
    // Space = O(1)

    public static void main(String[] args) {
        System.out.println(closeStrings("abc", "bca")); // true
        System.out.println(closeStrings("a", "aa")); // false
        System.out.println(closeStrings("cabbba", "abbccc")); // true 
    }
}
