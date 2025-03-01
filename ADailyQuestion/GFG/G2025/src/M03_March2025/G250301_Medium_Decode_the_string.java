package M03_March2025;

import java.util.Stack;

/*
Link: https://www.geeksforgeeks.org/problems/decode-the-string2444/1
Decode the string
 */
public class G250301_Medium_Decode_the_string {
    static String decodeString(String s) {
        Stack<String> str = new Stack<>();
        Stack<Integer> num = new Stack<>();
        String cur = "";
        int n = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) n = n * 10 + (c - '0');
            else if (c == '[') { str.push(cur); num.push(n); cur = ""; n = 0; }
            else if (c == ']') {
                String temp = cur;
                cur = str.pop();
                cur += temp.repeat(num.pop());
            } else cur += c;
        }
        return cur;
    }
}
