package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/remove-loop-in-linked-list/1
Remove loop in Linked List
Topic: Linked List
 */

/*
class Node
{
    int data;
    Node next;
}
*/

public class G250126_Medium_Remove_loop_in_Linked_List {
    public static void removeLoop(Node head) {
        if (head == null || head.next == null) return;

        Node slow = head;
        Node fast = head;

        // Step 1: Detect the loop using Floyd's Cycle Detection Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Loop detected
                break;
            }
        }

        // If no loop is found, return
        if (fast == null || fast.next == null) return;

        // Step 2: Find the start of the loop
        slow = head;
        Node prev = null; // To track the node before the loop's starting node

        if (slow == fast) { // Special case: Loop starts at the head
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null; // Break the loop
            return;
        }

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Break the loop
        if (prev != null) {
            prev.next = null;
        }
    }

    // Helper method to create a linked list with a loop for testing
    public static Node createLinkedList(int[] values, int pos) {
        if (values.length == 0) return null;

        Node head = new Node(values[0]); // Create the head node with the first value
        Node curr = head;
        Node loopNode = null;

        for (int i = 1; i < values.length; i++) {
            curr.next = new Node(values[i]); // Create new nodes with the given values
            curr = curr.next;
            if (i == pos - 1) {
                loopNode = curr; // Store the node to which the loop should connect
            }
        }

        if (pos != 0) {
            curr.next = loopNode; // Create the loop
        }

        return head;
    }

    // Helper method to check if the linked list has a loop
    public static boolean hasLoop(Node head) {
        if (head == null || head.next == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true; // Loop detected
        }

        return false;
    }

    // Helper method to print the linked list
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Test case 1
        int[] values1 = {1, 3, 4};
        int pos1 = 2;
        Node head1 = createLinkedList(values1, pos1);
        System.out.println("Has Loop (before): " + hasLoop(head1)); // true
        removeLoop(head1);
        System.out.println("Has Loop (after): " + hasLoop(head1)); // false
        printList(head1);

        // Test case 2
        int[] values2 = {1, 8, 3, 4};
        int pos2 = 0;
        Node head2 = createLinkedList(values2, pos2);
        System.out.println("Has Loop (before): " + hasLoop(head2)); // false
        removeLoop(head2);
        System.out.println("Has Loop (after): " + hasLoop(head2)); // false
        printList(head2);

        // Test case 3
        int[] values3 = {1, 2, 3, 4};
        int pos3 = 1;
        Node head3 = createLinkedList(values3, pos3);
        System.out.println("Has Loop (before): " + hasLoop(head3)); // true
        removeLoop(head3);
        System.out.println("Has Loop (after): " + hasLoop(head3)); // false
        printList(head3);
    }
}
