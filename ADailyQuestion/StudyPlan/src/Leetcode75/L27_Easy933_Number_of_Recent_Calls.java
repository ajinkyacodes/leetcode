package Leetcode75;
/*
Link: https://leetcode.com/problems/number-of-recent-calls/description/
933. Number of Recent Calls
Topic: Linked List, QUeue
 */
import java.util.*;
public class L27_Easy933_Number_of_Recent_Calls {
    public LinkedList<Integer> slideWindow;

    public void RecentCounter() {
        this.slideWindow = new LinkedList<Integer>();
    }

    public int ping(int t) {
        // step 1). append the current call
        this.slideWindow.addLast(t);

        // step 2). invalidate the outdated pings
        while (this.slideWindow.getFirst() < t - 3000)
            this.slideWindow.removeFirst();

        return this.slideWindow.size();
    }
    // Time = O(n)
    // Space = O(n)

/*
    public static void main(String[] args) {
        // Input format
        String[] commands = {"RecentCounter", "ping", "ping", "ping", "ping"};
        int[][] inputs = { {}, {1}, {100}, {3001}, {3002} };
        Object[] output = new Object[commands.length];

        RecentCounter counter = null;

        // Process commands
        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("RecentCounter")) {
                counter = new RecentCounter();
                output[i] = null;
            } else if (commands[i].equals("ping")) {
                output[i] = counter.ping(inputs[i][0]);
            }
        }

        // Print outputs
        System.out.print("Output: [");
        for (int i = 0; i < output.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(output[i]);
        }
        System.out.println("]");
    }
*/
}
