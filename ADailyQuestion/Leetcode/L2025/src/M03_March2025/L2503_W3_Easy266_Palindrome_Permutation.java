package M03_March2025;
/*
Link: https://leetcode.com/problems/palindrome-permutation/description/
266. Palindrome Permutation
 */
import java.util.*;
public class L2503_W3_Easy266_Palindrome_Permutation {
    // Approach #5 Using Set [Accepted]:
    public boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.add(s.charAt(i))) set.remove(s.charAt(i));
        }
        return set.size() <= 1;
    }
    // time = O(n)
    // space = O(n)
}
