package Leetcode75;
/*
Link: https://leetcode.com/problems/decode-string/description/
394. Decode String
Topic: Stack
 */
import java.util.*;
public class L26_Medium394_Decode_String {
    public static String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                List<Character> decodedString = new ArrayList<>();
                // get the encoded string
                while (stack.peek() != '[') {
                    decodedString.add(stack.pop());
                }
                // pop [ from the stack
                stack.pop();
                int base = 1;
                int k = 0;
                // get the number k
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    k = k + (stack.pop() - '0') * base;
                    base *= 10;
                }
                // decode k[decodedString], by pushing decodedString k times into stack
                while (k != 0) {
                    for (int j = decodedString.size() - 1; j >= 0; j--) {
                        stack.push(decodedString.get(j));
                    }
                    k--;
                }
            }
            // push the current character to stack
            else {
                stack.push(s.charAt(i));
            }
        }
        // get the result from stack
        char[] result = new char[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return new String(result);
    }
    // Time = O(n)
    // Space = O(n)

    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]")); // "aaabcbc"
        System.out.println(decodeString("3[a2[c]]")); // "accaccacc"
        System.out.println(decodeString("2[abc]3[cd]ef")); // "abcabccdcdcdef"
    }
}
