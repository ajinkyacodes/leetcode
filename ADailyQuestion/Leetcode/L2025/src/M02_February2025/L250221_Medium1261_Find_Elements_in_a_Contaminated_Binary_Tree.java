package M02_February2025;

/*
Link: https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree/description/
1261. Find Elements in a Contaminated Binary Tree
Approach: Tree Traversal (DFS)
 */

import java.util.HashSet;

// Definition for a binary tree node.
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode() {}
  TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
 }
}

public class L250221_Medium1261_Find_Elements_in_a_Contaminated_Binary_Tree {
    HashSet<Integer> seen;

    public L250221_Medium1261_Find_Elements_in_a_Contaminated_Binary_Tree(TreeNode root) {
        seen = new HashSet<>();
        dfs(root, 0);
    }

    public boolean find(int target) {
        return seen.contains(target);
    }

    private void dfs(TreeNode currentNode, int currentValue) {
        if (currentNode == null) return;
        // visit current node by adding its value to seen
        seen.add(currentValue);
        dfs(currentNode.left, currentValue * 2 + 1);
        dfs(currentNode.right, currentValue * 2 + 2);
    }
    // time = O(n)
    // space = O(n)
}
