package M02_February2025;
/*
Link: https://www.geeksforgeeks.org/problems/diameter-of-binary-tree/1
Diameter of a Binary Tree
Topic: Tree
 */
public class G250204_Medium_Diameter_of_a_Binary_Tree {
    int[] f(Node r) {
        if (r == null) return new int[]{0, 0};
        int[] a = f(r.left), b = f(r.right);
        int h = 1 + Math.max(a[0], b[0]);
        int d = Math.max(Math.max(a[1], b[1]), a[0] + b[0]);
        return new int[]{h, d};
    }

    int diameter(Node root) {
        return f(root)[1];
    }
}
