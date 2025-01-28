package Leetcode75;
/*
Link: https://leetcode.com/problems/dota2-senate/description/
649. Dota2 Senate
Topic: Queue
 */
import java.util.*;
public class L28_Medium649_Dota2_Senate {
    public static String predictPartyVictory(String senate) {
        // Approach: Two Queues

        // Number of Senator
        int n = senate.length();

        // Queues with Senator's Index.
        // Index will be used to find the next turn of Senator
        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();

        // Populate the Queues
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                rQueue.add(i);
            } else {
                dQueue.add(i);
            }
        }

        // While both parties have at least one Senator
        while (!rQueue.isEmpty() && !dQueue.isEmpty()) {

            // Pop the Next-Turn Senate from both Q.
            int rTurn = rQueue.poll();
            int dTurn = dQueue.poll();

            // ONE having a larger index will be banned by a lower index
            // Lower index will again get Turn, so EN-Queue again
            // But ensure its turn comes in the next round only
            if (dTurn < rTurn) {
                dQueue.add(dTurn + n);
            } else {
                rQueue.add(rTurn + n);
            }
        }

        // One's which Empty is not winner
        return rQueue.isEmpty() ? "Dire" : "Radiant";
    }
    // Time = O(n)
    // Space = O(n)

    public static void main(String[] args) {
        System.out.println(predictPartyVictory("RD")); // "Radiant"
        System.out.println(predictPartyVictory("RDD")); // "Dire"
    }
}
