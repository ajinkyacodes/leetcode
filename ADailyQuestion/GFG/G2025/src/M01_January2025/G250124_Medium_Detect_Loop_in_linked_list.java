package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
Detect Loop in linked list
Topic: Linked List
 */

/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
 */
import java.util.*;
public class G250124_Medium_Detect_Loop_in_linked_list {
    public static boolean detectLoop(Node head) {
        if (head == null || head.next == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move slow pointer by 1 step
            fast = fast.next.next;     // Move fast pointer by 2 steps

            if (slow == fast) {        // Cycle detected
                return true;
            }
        }

        return false; // No cycle found
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
        int[] values1 = {1, 3, 4};
        int pos1 = 2;
        Node head1 = createLinkedList(values1, pos1);
        System.out.println(detectLoop(head1)); // Output: true

        // Test case 2
        int[] values2 = {1, 8, 3, 4};
        int pos2 = 0;
        Node head2 = createLinkedList(values2, pos2);
        System.out.println(detectLoop(head2)); // Output: false

        // Test case 3
        int[] values3 = {1, 2, 3, 4};
        int pos3 = 1;
        Node head3 = createLinkedList(values3, pos3);
        System.out.println(detectLoop(head3)); // Output: false
    }
}
