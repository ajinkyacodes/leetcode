package M07_July2025;
/*
Link: https://leetcode.com/problems/closest-binary-search-tree-value-ii/description/
272. Closest Binary Search Tree Value II
 */
public class L2507_W5_Hard272_Closest_Binary_Search_Tree_Value_II {
    /*
    public List<Integer> closestKValues(TreeNode root, double target, int k) {
        List<Integer> arr = new ArrayList<>();
        dfs(root, arr);

        Collections.sort(arr, (o1, o2) -> Math.abs(o1 - target) <= Math.abs(o2 - target) ? -1 : 1);

        return arr.subList(0, k);

    }

    public void dfs(TreeNode node, List<Integer> arr) {
        if (node == null) {
            return;
        }

        arr.add(node.val);
        dfs(node.left, arr);
        dfs(node.right, arr);
    }
    // time = O(n⋅logn)
    // space = O(n)
     */
}
