package Leetcode75;
/*
Link: https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/description/
1161. Maximum Level Sum of a Binary Tree
Topic: Breadth First Search
 */
import java.util.*;
public class L39_Medium1161_Maximum_Level_Sum_of_a_Binary_Tree {
    public static int maxLevelSum(TreeNode root) {
        int maxSum = Integer.MIN_VALUE;
        int ans = 0, level = 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            level++;
            int sumAtCurrentLevel = 0;
            // Iterate over all the nodes in the current level.
            for (int sz = q.size(); sz > 0; --sz) {
                TreeNode node = q.poll();
                sumAtCurrentLevel += node.val;

                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }

            if (maxSum < sumAtCurrentLevel) {
                maxSum = sumAtCurrentLevel;
                ans = level;
            }
        }

        return ans;
    }
    // time = O(n)
    // space = O(n)
}
