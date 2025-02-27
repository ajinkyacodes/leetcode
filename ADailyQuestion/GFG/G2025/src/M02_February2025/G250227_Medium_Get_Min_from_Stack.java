package M02_February2025;

/*
Link: https://www.geeksforgeeks.org/problems/get-minimum-element-from-stack/1
Get Min from Stack
 */
import java.util.*;
public class G250227_Medium_Get_Min_from_Stack {
    Stack<Integer> s = new Stack<>(), m = new Stack<>();

    void push(int x) {
        s.push(x);
        m.push(m.isEmpty() ? x : Math.min(x, m.peek()));
    }

    void pop() {
        if (!s.isEmpty()) {
            s.pop();
            m.pop();
        }
    }

    int peek() {
        return s.isEmpty() ? -1 : s.peek();
    }

    int getMin() {
        return m.isEmpty() ? -1 : m.peek();
    }
}
