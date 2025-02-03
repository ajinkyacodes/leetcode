package M02_February2025;
/*
Link: https://www.geeksforgeeks.org/problems/height-of-binary-tree/1
Height of Binary Tree
Topic: Tree
 */
public class G250203_Easy_Height_of_Binary_Tree {
    int height(Node node) {
        // code here
        return node == null ? -1 : 1 + Math.max(height(node.left), height(node.right));
    }
}
