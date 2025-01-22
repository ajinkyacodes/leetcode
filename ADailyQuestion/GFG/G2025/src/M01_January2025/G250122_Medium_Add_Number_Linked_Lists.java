package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1
Add Number Linked Lists
Topics: Linked List

GitHub Repo Solution: https://github.com/Hunterdii/GeeksforGeeks-POTD/blob/main/January%202025%20GFG%20SOLUTION/January-22.java

 */


/* node for linked list
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
public class G250122_Medium_Add_Number_Linked_Lists {
    public static Node addTwoLists(Node l1, Node l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        Node dummy = new Node(0);
        Node tail = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }
            carry = sum / 10;
            tail.next = new Node(sum % 10);
            tail = tail.next;
        }

        Node res = reverse(dummy.next);
        while (res != null && res.data == 0 && res.next != null) {
            res = res.next;
        }
        return res;
    }
    // Time = O(n + m)
    // Space = O(max(n, m))

    private static Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Utility function to print a linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print(" ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example 1
        Node num1 = new Node(4);
        num1.next = new Node(5);

        Node num2 = new Node(3);
        num2.next = new Node(4);
        num2.next.next = new Node(5);

        Node result1 = addTwoLists(num1, num2);
        printList(result1); // Output: 3 -> 9 -> 0 -> null

        // Example 2
        Node num3 = new Node(0);
        num3.next = new Node(0);
        num3.next.next = new Node(6);
        num3.next.next.next = new Node(3);

        Node num4 = new Node(0);
        num4.next = new Node(7);

        Node result2 = addTwoLists(num3, num4);
        printList(result2); // Output: 7 -> 0 -> null
    }

}
