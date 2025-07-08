package Easy;
/*
Link: https://leetcode.com/problems/valid-anagram/description/
242. Valid Anagram
 */
import java.util.*;
public class Easy242_Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    // time = O(n log n)
    // space = O(n)
}
