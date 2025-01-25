package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/find-the-first-node-of-loop-in-linked-list--170645/1
Find the first node of loop in linked list
Topic: Linked List
 */

/* class Node
{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
}*/

public class G250125_Easy_Find_the_first_node_of_loop_in_linked_list {
    public static Node findFirstNode(Node head) {
        if (head == null || head.next == null) return null;

        Node slow = head;
        Node fast = head;
        Node meetingPoint = null;

        // Step 1: Detect the loop using Floyd's Cycle Detection
        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move slow pointer by 1 step
            fast = fast.next.next;     // Move fast pointer by 2 steps

            if (slow == fast) {        // Loop detected
                meetingPoint = slow;
                break;
            }
        }

        // If no loop is detected, return null
        if (meetingPoint == null) return null;

        // Step 2: Find the first node of the loop
        slow = head;
        while (slow != meetingPoint) {
            slow = slow.next;
            meetingPoint = meetingPoint.next;
        }

        return slow; // The first node of the loop
    }
    // Time = O(n)
    // Space = O(1)

    // Helper method to create a linked list with a loop for testing
    public static Node createLinkedList(int[] values, int pos) {
        if (values.length == 0) return null;

        Node head = new Node(values[0]);
        Node curr = head;
        Node loopNode = null;

        for (int i = 1; i < values.length; i++) {
            curr.next = new Node(values[i]);
            curr = curr.next;
            if (i == pos - 1) {
                loopNode = curr;
            }
        }

        if (pos != 0) {
            curr.next = loopNode; // Create a loop
        }

        return head;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] values1 = {1, 3, 2, 4, 5};
        int pos1 = 2;
        Node head1 = createLinkedList(values1, pos1);
        Node result1 = findFirstNode(head1);
        System.out.println(result1 != null ? result1.data : -1); // Output: 3

        // Test case 2
        int[] values2 = {1, 3, 2, 1};
        int pos2 = 0;
        Node head2 = createLinkedList(values2, pos2);
        Node result2 = findFirstNode(head2);
        System.out.println(result2 != null ? result2.data : -1); // Output: -1
    }
}
