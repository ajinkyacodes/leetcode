package M02_February2025;

import java.util.ArrayList;
import java.util.Stack;

/*
Link: https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1
Stock span problem
 */
public class G250224_Medium_Stock_span_problem {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            int days = 1;
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                days += span.get(st.pop());
            }
            span.add(days);
            st.push(i);
        }
        return span;
    }
}
