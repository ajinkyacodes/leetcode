package M06_June2025;
/*
Link: https://leetcode.com/problems/using-a-robot-to-print-the-lexicographically-smallest-string/description/
2434. Using a Robot to Print the Lexicographically Smallest String
 */
import java.util.*;
public class L250606_Medium2434_Using_a_Robot_to_Print_the_Lexicographically_Smallest_String {
    // Approach: Greedy + Stack
    public String robotWithString(String s) {
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            cnt[c - 'a']++;
        }

        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        char minCharacter = 'a';
        for (char c : s.toCharArray()) {
            stack.push(c);
            cnt[c - 'a']--;
            while (minCharacter != 'z' && cnt[minCharacter - 'a'] == 0) {
                minCharacter++;
            }
            while (!stack.isEmpty() && stack.peek() <= minCharacter) {
                res.append(stack.pop());
            }
        }

        return res.toString();
    }
    // time = O(n+∣Σ∣).
    // space = O(n).
}
