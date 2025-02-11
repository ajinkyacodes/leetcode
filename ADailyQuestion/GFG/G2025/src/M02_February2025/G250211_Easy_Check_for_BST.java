package M02_February2025;
/*
Link: https://www.geeksforgeeks.org/problems/check-for-bst/1
Check for BST
 */
public class G250211_Easy_Check_for_BST {
    boolean isBST(Node root) {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean isBST(Node node, int min, int max) {
        return node == null || (node.data > min && node.data < max &&
                isBST(node.left, min, node.data) &&
                isBST(node.right, node.data, max));
    }
}
