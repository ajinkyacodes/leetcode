package M01_January2025;
/*
Link:
261. Graph Valid Tree
Topic: DFS< BFS, Graph
 */
import java.util.*;
public class L2501_W5_Medium261_Graph_Valid_Tree {
    public static boolean validTree(int n, int[][] edges) {
        // Approach: BFS

        if (edges.length != n - 1) return false;

        // Make the adjacency list.
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> seen = new HashSet<>();
        queue.offer(0);
        seen.add(0);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int neighbour : adjacencyList.get(node)) {
                if (seen.contains(neighbour)) continue;
                seen.add(neighbour);
                queue.offer(neighbour);
            }
        }

        return seen.size() == n;
    }
    // time = o(n)
    // space = o(n)

    public static void main(String[] args) {
        int n1 = 5;
        int[][] edges1 = {{0,1},{0,2},{0,3},{1,4}};
        System.out.println(validTree(n1, edges1)); // true

        int n2 = 5;
        int[][] edges2 = {{0,1},{1,2},{2,3},{1,3},{1,4}};
        System.out.println(validTree(n2, edges2)); // false
    }
}
