package Leetcode75;

/*
Link: https://leetcode.com/problems/online-stock-span/description/
901. Online Stock Span
 */

import java.util.*;
public class L76_Medium901_Online_Stock_Span {
    // Approach: Monotonic Stack
    Stack<int[]> stack = new Stack<>();

    public int next(int price) {
        int ans = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            ans += stack.pop()[1];
        }

        stack.push(new int[] {price, ans});
        return ans;
    }
    // time = O(1)
    // space = O(n)
}
