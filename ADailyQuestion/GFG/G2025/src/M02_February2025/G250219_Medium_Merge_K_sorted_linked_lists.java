package M02_February2025;
/*
Link: https://www.geeksforgeeks.org/problems/merge-k-sorted-linked-lists/1
Merge K sorted linked lists
 */
import java.util.*;
public class G250219_Medium_Merge_K_sorted_linked_lists {
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> lists) {
        List<Integer> v = new ArrayList<>();
        for (Node l : lists) while (l != null) { v.add(l.data); l = l.next; }
        Collections.sort(v);
        Node d = new Node(0), t = d;
        for (int x : v) { t.next = new Node(x); t = t.next; }
        return d.next;
    }
}
