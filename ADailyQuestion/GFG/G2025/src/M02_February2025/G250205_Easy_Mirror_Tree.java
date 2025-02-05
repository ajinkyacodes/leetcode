package M02_February2025;
/*
Link: https://www.geeksforgeeks.org/problems/mirror-tree/1
Mirror Tree
Topic: Tree
 */

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
} */

public class G250205_Easy_Mirror_Tree {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        if (node == null) return;
        mirror(node.left);
        mirror(node.right);
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
