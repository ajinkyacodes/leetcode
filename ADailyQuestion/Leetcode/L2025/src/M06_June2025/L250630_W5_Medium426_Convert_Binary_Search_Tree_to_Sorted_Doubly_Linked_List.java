package M06_June2025;
/*
Link: https://leetcode.com/problems/convert-binary-search-tree-to-sorted-doubly-linked-list/description/
426. Convert Binary Search Tree to Sorted Doubly Linked List
 */
public class L250630_W5_Medium426_Convert_Binary_Search_Tree_to_Sorted_Doubly_Linked_List {
    // the smallest (first) and the largest (last) nodes
    /*
    Node first = null;
    Node last = null;

    public void helper(Node node) {
        if (node != null) {
            // left
            helper(node.left);

            // node
            if (last != null) {
                // link the previous node (last)
                // with the current one (node)
                last.right = node;
                node.left = last;
            }
            else {
                // keep the smallest node
                // to close DLL later on
                first = node;
            }
            last = node;

            // right
            helper(node.right);
        }
    }

    public Node treeToDoublyList(Node root) {
        if (root == null) return null;

        helper(root);

        // close DLL
        last.right = first;
        first.left = last;
        return first;
    }
     */
    // time = O(N)
    // Space = O(N)
}
