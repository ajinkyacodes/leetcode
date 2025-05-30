package Leetcode75;
/*
Link: https://leetcode.com/problems/binary-tree-right-side-view/description/
199. Binary Tree Right Side View
Topic: BFS: Two Queues
 */
import java.util.*;
public class L39_Medium199_Binary_Tree_Right_Side_View {
    public static List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<Integer>();

        ArrayDeque<TreeNode> nextLevel = new ArrayDeque() {
            {
                offer(root);
            }
        };
        ArrayDeque<TreeNode> currLevel = new ArrayDeque();
        List<Integer> rightside = new ArrayList();

        TreeNode node = null;
        while (!nextLevel.isEmpty()) {
            // prepare for the next level
            currLevel = nextLevel;
            nextLevel = new ArrayDeque<>();

            while (!currLevel.isEmpty()) {
                node = currLevel.poll();

                // add child nodes of the current level
                // in the queue for the next level
                if (node.left != null) nextLevel.offer(node.left);
                if (node.right != null) nextLevel.offer(node.right);
            }

            // The current level is finished.
            // Its last element is the rightmost one.
            if (currLevel.isEmpty()) rightside.add(node.val);
        }
        return rightside;
    }
    // time = O(n)
    // space = O(d) where d is a tree diameter
}
