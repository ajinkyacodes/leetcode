package M05_May2025;
/*
Link: https://leetcode.com/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/description/
1474. Delete N Nodes After M Nodes of a Linked List
 */

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class L2505_W5_Easy1474_Delete_N_Nodes_After_M_Nodes_of_a_Linked_List {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode currentNode = head;
        ListNode lastMNode = head;
        while (currentNode != null) {
            // initialize mCount to m and nCount to n
            int mCount = m, nCount = n;
            // traverse m nodes
            while (currentNode != null && mCount != 0) {
                lastMNode = currentNode;
                currentNode = currentNode.next;
                mCount--;
            }
            // traverse n nodes
            while (currentNode != null && nCount != 0) {
                currentNode = currentNode.next;
                nCount--;
            }
            // delete n nodes
            lastMNode.next = currentNode;
        }
        return head;
    }
    // time = O(N)
    // space = O(1)
}
