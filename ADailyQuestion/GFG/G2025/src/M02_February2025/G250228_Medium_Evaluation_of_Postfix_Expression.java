package M02_February2025;
/*
Link: https://www.geeksforgeeks.org/problems/evaluation-of-postfix-expression1735/1
Evaluation of Postfix Expression
 */
import java.util.*;
public class G250228_Medium_Evaluation_of_Postfix_Expression {
    public int evaluate(String[] arr) {
        Stack<Integer> st = new Stack<>();
        for (String s : arr) {
            if ("+-*/".contains(s)) {
                int b = st.pop(), a = st.pop();
                if (s.equals("+")) st.push(a + b);
                else if (s.equals("-")) st.push(a - b);
                else if (s.equals("*")) st.push(a * b);
                else st.push(a / b);
            } else {
                st.push(Integer.parseInt(s));
            }
        }
        return st.peek();
    }
}
