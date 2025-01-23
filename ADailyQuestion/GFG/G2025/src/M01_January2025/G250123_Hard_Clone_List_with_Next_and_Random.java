package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/clone-a-linked-list-with-next-and-random-pointer/1
Clone List with Next and Random
Topics: Linked List
Solution:
 */
//private class Node {
//    int data;
//    Node next;
//    Node random;
//
//    Node(int x) {
//        data = x;
//        next = null;
//        random = null;
//    }
//}

public class G250123_Hard_Clone_List_with_Next_and_Random {
    public static Node cloneLinkedList(Node head) {
        if (head == null) return null;

        // Step 1: Create new nodes and insert them between the original nodes
        Node curr = head;
        while (curr != null) {
            Node copy = new Node(curr.value); // GFG: change value to data
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        // Step 2: Assign random pointers for the copied nodes
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Step 3: Separate the original and copied lists
        curr = head;
        Node dummy = new Node(0);
        Node copyCurr = dummy;
        while (curr != null) {
            Node copy = curr.next;
            copyCurr.next = copy;
            copyCurr = copy;

            curr.next = copy.next;
            curr = curr.next;
        }

        return dummy.next;
    }

    // Helper method to print a list for testing
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print("[" + curr.value + ", ");
            System.out.print(curr.random != null ? curr.random.value : "NULL");
            System.out.print("] -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        G250123_Hard_Clone_List_with_Next_and_Random solution = new G250123_Hard_Clone_List_with_Next_and_Random();

        // Test case example
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head.random = head.next.next; // 1 -> 3
        head.next.random = head;     // 2 -> 1
        head.next.next.random = head.next.next.next; // 3 -> 4
        head.next.next.next.random = head.next;      // 4 -> 2

        System.out.println("Original list:");
        solution.printList(head);

        Node clonedHead = solution.cloneLinkedList(head);

        System.out.println("Cloned list:");
        solution.printList(clonedHead);

        System.out.println("Original list after cloning:");
        solution.printList(head);
    }
}
