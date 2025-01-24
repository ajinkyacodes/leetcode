package Leetcode75;
/*
Link: https://leetcode.com/problems/removing-stars-from-a-string/description/
2390. Removing Stars From a String
Topic: Stack
 */
import java.util.*;
public class L24_Medium2390_Removing_Stars_From_a_String {
    public static String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='*') {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }

        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
    // Time = O(n)
    // Space = O(n)

    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e")); // "lecoe"
        System.out.println(removeStars("erase*****")); // ""
    }
}
