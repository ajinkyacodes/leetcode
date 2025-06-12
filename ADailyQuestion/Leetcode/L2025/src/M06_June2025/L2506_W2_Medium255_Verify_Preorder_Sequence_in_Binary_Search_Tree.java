package M06_June2025;
/*
Link: https://leetcode.com/problems/verify-preorder-sequence-in-binary-search-tree/description/
255. Verify Preorder Sequence in Binary Search Tree
 */
import java.util.*;
public class L2506_W2_Medium255_Verify_Preorder_Sequence_in_Binary_Search_Tree {
    public boolean verifyPreorder(int[] preorder) {
        int minLimit = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();

        for (int num: preorder) {
            while (!stack.isEmpty() && stack.peek() < num) {
                minLimit = stack.pop();
            }

            if (num <= minLimit) {
                return false;
            }

            stack.push(num);
        }

        return true;
    }
    // time = O(n)
    // space = O(n)
}
