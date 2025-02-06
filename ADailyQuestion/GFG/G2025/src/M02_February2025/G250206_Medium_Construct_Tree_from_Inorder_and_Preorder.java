package M02_February2025;
/*
Link: https://www.geeksforgeeks.org/problems/construct-tree-1/1
Construct Tree from Inorder & Preorder
Topic: Tree
 */

/*
class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}
*/
import java.util.*;
public class G250206_Medium_Construct_Tree_from_Inorder_and_Preorder {
    static int i;
    static HashMap<Integer, Integer> m;
    public static Node buildTree(int inorder[], int preorder[]) {
        i = 0;
        m = new HashMap<>();
        for (int j = 0; j < inorder.length; j++) m.put(inorder[j], j);
        return f(inorder, preorder, 0, inorder.length - 1);
    }
    // time = O(n)
    // space = O(n)

    static Node f(int[] in, int[] pre, int l, int r) {
        if (l > r) return null;
        Node root = new Node(pre[i++]);
        root.left = f(in, pre, l, m.get(root.data) - 1);
        root.right = f(in, pre, m.get(root.data) + 1, r);
        return root;
    }
}
