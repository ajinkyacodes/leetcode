package M02_February2025;
/*
Link: https://www.geeksforgeeks.org/problems/inorder-traversal/1
Inorder Traversal
Topic: Binary Tree
 */

/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
import java.util.*;
public class G250207_Easy_Inorder_Traversal {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    void inorderHelper(Node root, ArrayList<Integer> result) {
        if (root == null) return;
        inorderHelper(root.left, result);
        result.add(root.data);
        inorderHelper(root.right, result);
    }
    // time = O(n)
    // space = O(h) where h is the height of the binary tree
}
