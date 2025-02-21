package M02_February2025;

import java.util.Stack;

/*
Link: https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1
Parenthesis Checker
 */
public class G250221_EasyParenthesis_Checker {
    static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray())
            if ("({[".indexOf(c) >= 0) st.push(c);
            else if (st.isEmpty() || Math.abs(st.peek() - c) > 2) return false;
            else st.pop();
        return st.isEmpty();
    }
}
