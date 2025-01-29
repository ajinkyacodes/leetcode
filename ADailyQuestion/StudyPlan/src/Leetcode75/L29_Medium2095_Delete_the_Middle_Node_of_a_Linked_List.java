package Leetcode75;
/*
Link: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/
2095. Delete the Middle Node of a Linked List
Topic: Linked List
 */


 // Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
public class L29_Medium2095_Delete_the_Middle_Node_of_a_Linked_List {
    public ListNode deleteMiddle(ListNode head) {
        //Approach: 2 Passes

        // Edge case: return None if there is only one node
        if (head.next == null)
            return null;

        int count = 0;
        ListNode p1 = head, p2 = head;

        // First pass, count the number of nodes in the linked list using 'p1'.
        while (p1 != null) {
            count += 1;
            p1 = p1.next;
        }

        // Get the index of the node to be deleted.
        int middleIndex = count / 2;

        // Second pass, let 'p2' move toward the predecessor of the middle node.
        for (int i = 0; i < middleIndex - 1; ++i)
            p2 = p2.next;

        // Delete the middle node and return 'head'.
        p2.next = p2.next.next;
        return head;
    }
    // time = O(n)
    // space = O(1)
}
