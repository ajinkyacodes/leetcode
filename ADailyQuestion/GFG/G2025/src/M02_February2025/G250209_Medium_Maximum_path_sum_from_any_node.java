package M02_February2025;
/*
Link: https://www.geeksforgeeks.org/problems/maximum-path-sum-from-any-node/1
Maximum path sum from any node
Topic: Tree
 */
public class G250209_Medium_Maximum_path_sum_from_any_node {
    int dfs(Node r, int[] res) {
        if (r == null) return 0;
        int l = Math.max(0, dfs(r.left, res)), rgt = Math.max(0, dfs(r.right, res));
        res[0] = Math.max(res[0], l + rgt + r.data);
        return Math.max(l, rgt) + r.data;
    }

    int findMaxSum(Node root) {
        int[] res = {Integer.MIN_VALUE};
        dfs(root, res);
        return res[0];
    }
    // time = O(n)
    // space = O(h) where h is height of the tree
}
