package Easy;
/*
Link: https://leetcode.com/problems/middle-of-the-linked-list/description/
876. Middle of the Linked List
Topics: Linked List, Two Pointers
 */

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Easy876 {
    public static ListNode middleNode(ListNode head) {
        // Two-pointer approach
        ListNode slow = head;
        ListNode fast = head;

        // Move fast pointer twice as fast as the slow pointer
        while (fast != null && fast.next != null) {
            slow = slow.next;        // Move slow pointer one step
            fast = fast.next.next;  // Move fast pointer two steps
        }

        // When fast reaches the end, slow will be at the middle node
        return slow;
    }
    // TC = O(n)
    // SC = O(1)

    // Helper method to create a linked list from an array
    public static ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to print the linked list from a given node
    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example 1
        int[] input1 = {1, 2, 3, 4, 5};
        ListNode head1 = createLinkedList(input1);
        ListNode middle1 = middleNode(head1);
        printLinkedList(middle1);  // Output: 3 4 5

        // Example 2
        int[] input2 = {1, 2, 3, 4, 5, 6};
        ListNode head2 = createLinkedList(input2);
        ListNode middle2 = middleNode(head2);
        printLinkedList(middle2);  // Output: 4 5 6
    }
}
