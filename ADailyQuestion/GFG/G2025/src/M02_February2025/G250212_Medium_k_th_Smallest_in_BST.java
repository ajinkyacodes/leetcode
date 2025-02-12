package M02_February2025;
/*
Link: https://www.geeksforgeeks.org/problems/find-k-th-smallest-element-in-bst/1
k-th Smallest in BST
 */
public class G250212_Medium_k_th_Smallest_in_BST {
    public int kthSmallest(Node root, int k) {
        while (root != null) {
            if (root.left == null) {
                if (--k == 0) return root.data;
                root = root.right;
            } else {
                Node pre = root.left;
                while (pre.right != null && pre.right != root) pre = pre.right;
                if (pre.right == null) {
                    pre.right = root;
                    root = root.left;
                } else {
                    pre.right = null;
                    if (--k == 0) return root.data;
                    root = root.right;
                }
            }
        }
        return -1;
    }
}
