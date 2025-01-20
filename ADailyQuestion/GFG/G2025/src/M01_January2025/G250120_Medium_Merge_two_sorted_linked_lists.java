package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1
Merge two sorted linked lists
 */

// Node is defined as
 /*
 class Node {
    int value;
    int data;
    Node next;

    Node(int value) {
        next = null;
        data = value;
        this.value = value;
    }
}
 */

public class G250120_Medium_Merge_two_sorted_linked_lists {
    public static Node sortedMerge(Node head1, Node head2) {
        // Create a dummy node to act as the head of the merged list
        Node dummy = new Node(-1);
        Node current = dummy;

        // Traverse both lists and add the smaller value to the merged list
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        // Append the remaining nodes of either list
        if (head1 != null) {
            current.next = head1;
        } else if (head2 != null) {
            current.next = head2;
        }

        // Return the merged list, skipping the dummy node
        return dummy.next;
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
        Node head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        head1.next.next.next = new Node(40);

        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);

        Node mergedHead1 = sortedMerge(head1, head2);
        printList(mergedHead1); // Output: 2 -> 3 -> 5 -> 10 -> 15 -> 20 -> 40 -> null

        // Example 2
        Node head3 = new Node(1);
        head3.next = new Node(1);

        Node head4 = new Node(2);
        head4.next = new Node(4);

        Node mergedHead2 = sortedMerge(head3, head4);
        printList(mergedHead2); // Output: 1 -> 1 -> 2 -> 4 -> null
    }
}
