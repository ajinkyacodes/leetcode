package M01_January2025;
/*
Link: https://leetcode.com/problems/divide-nodes-into-the-maximum-number-of-groups/description/
2493. Divide Nodes Into the Maximum Number of Groups
Topic: BFS
 */
import java.util.*;
public class L250130_Hard2493_Divide_Nodes_Into_the_Maximum_Number_of_Groups {
    public static int magnificentSets(int n, int[][] edges) {
        // Approach 2: BFS + Union-Find

        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        int[] parent = new int[n];
        int[] depth = new int[n];
        Arrays.fill(parent, -1);

        // Build the adjacency list and apply Union-Find for each edge
        for (int[] edge : edges) {
            adjList.get(edge[0] - 1).add(edge[1] - 1);
            adjList.get(edge[1] - 1).add(edge[0] - 1);
            union(edge[0] - 1, edge[1] - 1, parent, depth);
        }

        Map<Integer, Integer> numOfGroupsForComponent = new HashMap<>();

        // For each node, calculate the maximum number of groups for its component
        for (int node = 0; node < n; node++) {
            int numberOfGroups = getNumberOfGroups(adjList, node, n);
            if (numberOfGroups == -1) return -1; // If invalid split, return -1
            int rootNode = find(node, parent);
            numOfGroupsForComponent.put(
                    rootNode,
                    Math.max(
                            numOfGroupsForComponent.getOrDefault(rootNode, 0),
                            numberOfGroups
                    )
            );
        }

        // Calculate the total number of groups across all components
        int totalNumberOfGroups = 0;
        for (int numberOfGroups : numOfGroupsForComponent.values()) {
            totalNumberOfGroups += numberOfGroups;
        }
        return totalNumberOfGroups;
    }
    // time = O(n×(n+m))
    // space = O(n)

    // Function to calculate the number of groups for a given component starting from srcNode
    private static int getNumberOfGroups(
            List<List<Integer>> adjList,
            int srcNode,
            int n
    ) {
        Queue<Integer> nodesQueue = new LinkedList<>();
        int[] layerSeen = new int[n];
        Arrays.fill(layerSeen, -1);
        nodesQueue.offer(srcNode);
        layerSeen[srcNode] = 0;
        int deepestLayer = 0;

        // Perform BFS to calculate the number of layers (groups)
        while (!nodesQueue.isEmpty()) {
            int numOfNodesInLayer = nodesQueue.size();
            for (int i = 0; i < numOfNodesInLayer; i++) {
                int currentNode = nodesQueue.poll();
                for (int neighbor : adjList.get(currentNode)) {
                    // If neighbor hasn't been visited, assign it to the next layer
                    if (layerSeen[neighbor] == -1) {
                        layerSeen[neighbor] = deepestLayer + 1;
                        nodesQueue.offer(neighbor);
                    } else {
                        // If the neighbor is already in the same layer, return -1 (invalid partition)
                        if (layerSeen[neighbor] == deepestLayer) {
                            return -1;
                        }
                    }
                }
            }
            deepestLayer++;
        }
        return deepestLayer;
    }

    // Find the root of the given node in the Union-Find structure
    private static int find(int node, int[] parent) {
        while (parent[node] != -1) node = parent[node];
        return node;
    }

    // Union operation to merge two sets
    private static void union(int node1, int node2, int[] parent, int[] depth) {
        node1 = find(node1, parent);
        node2 = find(node2, parent);

        // If both nodes already belong to the same set, no action needed
        if (node1 == node2) return;

        // Union by rank (depth) to keep the tree balanced
        if (depth[node1] < depth[node2]) {
            int temp = node1;
            node1 = node2;
            node2 = temp;
        }
        parent[node2] = node1;

        // If the depths are equal, increment the depth of the new root
        if (depth[node1] == depth[node2]) depth[node1]++;
    }

    public static void main(String[] args) {
        int n1 = 6;
        int[][] edges1 = {{1,2},{1,4},{1,5},{2,6},{2,3},{4,6}};
        System.out.println(magnificentSets(n1, edges1)); // 4

        int n2 = 3;
        int[][] edges2 = {{1,2},{2,3},{3,1}};
        System.out.println(magnificentSets(n2, edges2)); // -1
    }
}
