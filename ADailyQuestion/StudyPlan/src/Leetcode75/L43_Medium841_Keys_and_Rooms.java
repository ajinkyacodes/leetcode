package Leetcode75;
/*
Link: https://leetcode.com/problems/keys-and-rooms/description/
841. Keys and Rooms
Topic: DFS
 */
import java.util.*;
public class L43_Medium841_Keys_and_Rooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        seen[0] = true;
        Stack<Integer> stack = new Stack();
        stack.push(0);

        //At the beginning, we have a todo list "stack" of keys to use.
        //'seen' represents at some point we have entered this room.
        while (!stack.isEmpty()) { // While we have keys...
            int node = stack.pop(); // Get the next key 'node'
            for (int nei: rooms.get(node)) // For every key in room # 'node'...
                if (!seen[nei]) { // ...that hasn't been used yet
                    seen[nei] = true; // mark that we've entered the room
                    stack.push(nei); // add the key to the todo list
                }
        }

        for (boolean v: seen)  // if any room hasn't been visited, return false
            if (!v) return false;
        return true;
    }
    // time = O(N+E), where N is the number of rooms, and E is the total number of keys.
    // space = O(N) in additional space complexity, to store stack and seen.
}
