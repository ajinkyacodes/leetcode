package M01_January2025;
/*
Link: https://leetcode.com/problems/find-eventual-safe-states/description/
802. Find Eventual Safe States
Topic: DFS
 */
import java.util.*;
public class L250124_Medium802_Find_Eventual_Safe_States {
    public static boolean dfs(
            int node,
            int[][] adj,
            boolean[] visit,
            boolean[] inStack
    ) {
        // If the node is already in the stack, we have a cycle.
        if (inStack[node]) {
            return true;
        }
        if (visit[node]) {
            return false;
        }
        // Mark the current node as visited and part of current recursion stack.
        visit[node] = true;
        inStack[node] = true;
        for (int neighbor : adj[node]) {
            if (dfs(neighbor, adj, visit, inStack)) {
                return true;
            }
        }
        // Remove the node from the stack.
        inStack[node] = false;
        return false;
    }

    public static List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        boolean[] visit = new boolean[n];
        boolean[] inStack = new boolean[n];

        for (int i = 0; i < n; i++) {
            dfs(i, graph, visit, inStack);
        }

        List<Integer> safeNodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!inStack[i]) {
                safeNodes.add(i);
            }
        }

        return safeNodes;
    }
    // Space = O(m + n)
    // Time = O(n)

    public static void main(String[] args) {
        System.out.println(eventualSafeNodes(new int[][]{{1,2},{2,3},{5},{0},{5},{},{}})); // [2,4,5,6]
        System.out.println(eventualSafeNodes(new int[][]{{1,2,3,4},{1,2},{3,4},{0,4},{}})); // [4]
    }
}
