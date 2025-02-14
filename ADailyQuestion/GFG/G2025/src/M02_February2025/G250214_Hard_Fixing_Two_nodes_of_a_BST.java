package M02_February2025;
/*
Link: https://www.geeksforgeeks.org/problems/fixed-two-nodes-of-a-bst/1
Fixing Two nodes of a BST
 */
public class G250214_Hard_Fixing_Two_nodes_of_a_BST {
    Node first, middle, last, prev;

    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        if (prev != null && root.data < prev.data) {
            if (first == null) {
                first = prev;
                middle = root;
            } else {
                last = root;
            }
        }
        prev = root;
        inorder(root.right);
    }

    void correctBST(Node root) {
        first = middle = last = prev = null;
        inorder(root);
        int temp = first.data;
        first.data = (last != null) ? last.data : middle.data;
        if (last != null) last.data = temp;
        else middle.data = temp;
    }
}
