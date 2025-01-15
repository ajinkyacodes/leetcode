package Leetcode75;
/*
Link: https://leetcode.com/problems/reverse-words-in-a-string/description/
151. Reverse Words in a String
Topics: Two Pointer, String
 */
import java.util.*;
public class L06_Medium151_Reverse_Words_in_a_String {
    public static String reverseWords(String s) {
        // Trim leading and trailing spaces and split the string by spaces
        String[] words = s.trim().split("\\s+");

        // Reverse the array of words
        Collections.reverse(Arrays.asList(words));

        // Join the words with a single space and return
        return String.join(" ", words);
    }
    // TC = O(N)
    // SC = O(N)

    public static void main(String[] args) {
        String s1 = "the sky is blue";
        System.out.println(reverseWords(s1)); // "blue is sky the"

        String s2 = "  hello world  ";
        System.out.println(reverseWords(s2)); // "world hello"

        String s3 = "a good   example";
        System.out.println(reverseWords(s3)); // "example good a"
    }
}
