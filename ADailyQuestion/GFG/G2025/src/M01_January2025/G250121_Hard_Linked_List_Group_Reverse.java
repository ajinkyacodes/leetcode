package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1
Linked List Group Reverse
 */

/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/
public class G250121_Hard_Linked_List_Group_Reverse {
    public static Node reverseKGroup(Node head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node prevGroupEnd = dummy;

        while (true) {
            Node groupStart = prevGroupEnd.next;
            Node groupEnd = prevGroupEnd;

            // Find the k-th node in the group
            for (int i = 0; i < k && groupEnd != null; i++) {
                groupEnd = groupEnd.next;
            }

            // If there are fewer than k nodes left, break the loop
            if (groupEnd == null) {
                break;
            }

            Node nextGroupStart = groupEnd.next;
            groupEnd.next = null;

            // Reverse the current group
            prevGroupEnd.next = reverseList(groupStart);

            // Connect the reversed group to the next group
            groupStart.next = nextGroupStart;

            // Move the prevGroupEnd pointer to the end of the reversed group
            prevGroupEnd = groupStart;
        }

        // Handle the remaining nodes if the total number of nodes is not a multiple of k
        Node remainingStart = prevGroupEnd.next;
        if (remainingStart != null) {
            prevGroupEnd.next = reverseList(remainingStart);
        }

        return dummy.next;
    }
    // Time = O(n)
    // Space = O(1)

    private static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    // Utility function to print a linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Example 1
        Node head1 = new Node(3);
        head1.next = new Node(5);
        head1.next.next = new Node(4);
        head1.next.next.next = new Node(7);
        head1.next.next.next.next = new Node(7);
        head1.next.next.next.next.next = new Node(9);
        head1.next.next.next.next.next.next = new Node(8);
        head1.next.next.next.next.next.next.next = new Node(3);
        head1.next.next.next.next.next.next.next.next = new Node(1);
        head1.next.next.next.next.next.next.next.next.next = new Node(8);
        head1.next.next.next.next.next.next.next.next.next.next = new Node(6);

        int k1 = 3;
        Node result1 = reverseKGroup(head1, k1);
        printList(result1); // Output: 4 -> 5 -> 3 -> 9 -> 7 -> 7 -> 1 -> 3 -> 8 -> 6 -> 8 -> null

        // Example 2
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);
        head2.next.next.next.next = new Node(5);

        int k2 = 3;
        Node result2 = reverseKGroup(head2, k2);
        printList(result2); // Output: 3 -> 2 -> 1 -> 5 -> 4 -> null
    }
}
