package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/rotate-a-linked-list/1
Rotate a Linked List
Topic: Linked List
 */

/*

// node of linked list:

class Node {
    int value;
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

public class G250119_Medium_Rotate_a_Linked_List {
    public static Node rotate(Node head, int k) {
        // Edge case: Empty list or single node
        if (head == null || head.next == null || k == 0) return head;

        // Step 1: Calculate the length of the linked list
        int length = 1;
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Step 2: Optimize k by taking modulo with length
        k = k % length;
        if (k == 0) return head; // No rotation needed

        // Step 3: Find the new tail after k rotations
        Node newTail = head;
        for (int i = 1; i < k; i++) {
            newTail = newTail.next;
        }

        // Step 4: Update pointers to rotate the list
        Node newHead = newTail.next;
        newTail.next = null;
        tail.next = head;

        return newHead;
    }
    // TC = O(n)
    // SC = O(1)

    // Helper method to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // Example 1
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);
        head1.next.next.next.next = new Node(50);
        int k1 = 4;
        Node result1 = rotate(head1, k1);
        printList(result1); // Expected Output: 50 -> 10 -> 20 -> 30 -> 40 -> NULL

        // Example 2
        Node head2 = new Node(10);
        head2.next = new Node(20);
        head2.next.next = new Node(30);
        head2.next.next.next = new Node(40);
        int k2 = 6;
        Node result2 = rotate(head2, k2);
        printList(result2); // Expected Output: 30 -> 40 -> 10 -> 20 -> NULL
    }
}
