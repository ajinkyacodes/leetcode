package M02_February2025;
/*
Link:
Level order traversal
Topic: Tree
 */

import java.util.ArrayList;
import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class G250202_Easy_Level_order_traversal {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<>();
            for (int i = q.size(); i > 0; i--) {
                Node n = q.poll();
                level.add(n.data);
                if (n.left != null) q.add(n.left);
                if (n.right != null) q.add(n.right);
            }
            res.add(level);
        }
        return res;
    }
}
