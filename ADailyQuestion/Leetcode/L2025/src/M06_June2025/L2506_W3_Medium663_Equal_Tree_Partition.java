package M06_June2025;

import java.util.Stack;

/*
Link: https://leetcode.com/problems/equal-tree-partition/description/
663. Equal Tree Partition
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class L2506_W3_Medium663_Equal_Tree_Partition {
    /*
    Stack<Integer> seen;
    public boolean checkEqualTree(TreeNode root) {
        seen = new Stack();
        int total = sum(root);
        seen.pop();
        if (total % 2 == 0) {
            for (int s: seen) {
                if (s == total / 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public int sum(TreeNode node) {
        if (node == null) {
            return 0;
        }
        seen.push(sum(node.left) + sum(node.right) + node.val);
        return seen.peek();
    }
    */
    // time = O(N)
    // space = O(N)
}
