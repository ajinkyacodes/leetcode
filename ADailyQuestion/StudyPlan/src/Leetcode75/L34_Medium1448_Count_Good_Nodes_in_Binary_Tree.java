package Leetcode75;
/*
Link: https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/
1448. Count Good Nodes in Binary Tree
Topic: DFS, Recursion
Approach: Depth First Search, Recursion
 */
public class L34_Medium1448_Count_Good_Nodes_in_Binary_Tree {
    private int numGoodNodes = 0;

    public int goodNodes(TreeNode root) {
        dfs(root, Integer.MIN_VALUE);
        return numGoodNodes;
    }

    private void dfs(TreeNode node, int maxSoFar) {
        if (maxSoFar <= node.val) {
            numGoodNodes++;
        }

        if (node.right != null) {
            dfs(node.right, Math.max(node.val, maxSoFar));
        }

        if (node.left != null) {
            dfs(node.left, Math.max(node.val, maxSoFar));
        }
    }

    // time = O(n)
    // space = O(n)
}
