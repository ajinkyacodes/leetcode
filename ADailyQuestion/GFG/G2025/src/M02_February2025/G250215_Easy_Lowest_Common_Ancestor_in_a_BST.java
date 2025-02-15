package M02_February2025;
/*
Link: https://www.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-bst/1
Lowest Common Ancestor in a BST
 */
public class G250215_Easy_Lowest_Common_Ancestor_in_a_BST {
    Node LCA(Node root, Node n1, Node n2) {
        while (root != null && (root.data > Math.max(n1.data, n2.data) || root.data < Math.min(n1.data, n2.data)))
            root = (root.data > n1.data) ? root.left : root.right;
        return root;
    }
}
