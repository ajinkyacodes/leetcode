package M01_January2025;
/*
Link: https://leetcode.com/problems/maximum-employees-to-be-invited-to-a-meeting/description/
2127. Maximum Employees to Be Invited to a Meeting
Topic: DFS, Topological Sort
Approach 2: Topological Sort to Reduce Non-Cyclic Nodes
 */
import java.util.*;
public class L250126_Hard2127_Maximum_Employees_to_Be_Invited_to_a_Meeting {
    public static int maximumInvitations(int[] favorite) {
        int n = favorite.length;
        int[] inDegree = new int[n];

        // Calculate in-degree for each node
        for (int person = 0; person < n; ++person) {
            inDegree[favorite[person]]++;
        }

        // Topological sorting to remove non-cycle nodes
        Queue<Integer> q = new LinkedList<>();
        for (int person = 0; person < n; ++person) {
            if (inDegree[person] == 0) {
                q.offer(person);
            }
        }

        int[] depth = new int[n]; // Depth of each node
        Arrays.fill(depth, 1);

        while (!q.isEmpty()) {
            int currentNode = q.poll();
            int nextNode = favorite[currentNode];
            depth[nextNode] = Math.max(depth[nextNode], depth[currentNode] + 1);
            if (--inDegree[nextNode] == 0) {
                q.offer(nextNode);
            }
        }

        int longestCycle = 0;
        int twoCycleInvitations = 0;

        // Detect cycles
        for (int person = 0; person < n; ++person) {
            if (inDegree[person] == 0) continue; // Already processed

            int cycleLength = 0;
            int current = person;
            while (inDegree[current] != 0) {
                inDegree[current] = 0; // Mark as visited
                cycleLength++;
                current = favorite[current];
            }

            if (cycleLength == 2) {
                // For 2-cycles, add the depth of both nodes
                twoCycleInvitations += depth[person] + depth[favorite[person]];
            } else {
                longestCycle = Math.max(longestCycle, cycleLength);
            }
        }

        return Math.max(longestCycle, twoCycleInvitations);
    }
    // Time = O(n)
    // Space = O(n)

    public static void main(String[] args) {
        int[] favorite1 = {2,2,1,2};
        System.out.println(maximumInvitations(favorite1)); // 3

        int[] favorite2 = {1,2,0};
        System.out.println(maximumInvitations(favorite2)); // 3

        int[] favorite3 = {3,0,1,4,1};
        System.out.println(maximumInvitations(favorite3)); // 4
    }
}
