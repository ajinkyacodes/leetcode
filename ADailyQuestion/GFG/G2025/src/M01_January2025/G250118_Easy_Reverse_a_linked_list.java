package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1
Reverse a linked list
Topics: Linked List
 */

// linked list node class:

class Node {
    int value;
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

public class G250118_Easy_Reverse_a_linked_list {
    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    // TC = O(n)
    // TC = O(1)

    // Helper function to print a linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.value + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // Example 1
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        System.out.println("Original List:");
        printList(head1);

        Node reversedHead1 = reverseList(head1);
        System.out.println("Reversed List:");
        printList(reversedHead1);

        // Example 2
        Node head2 = new Node(2);
        head2.next = new Node(7);
        head2.next.next = new Node(10);
        head2.next.next.next = new Node(9);
        head2.next.next.next.next = new Node(8);
        System.out.println("\nOriginal List:");
        printList(head2);

        Node reversedHead2 = reverseList(head2);
        System.out.println("Reversed List:");
        printList(reversedHead2);

        // Example 3
        Node head3 = new Node(2);
        System.out.println("\nOriginal List:");
        printList(head3);

        Node reversedHead3 = reverseList(head3);
        System.out.println("Reversed List:");
        printList(reversedHead3);
    }
}
