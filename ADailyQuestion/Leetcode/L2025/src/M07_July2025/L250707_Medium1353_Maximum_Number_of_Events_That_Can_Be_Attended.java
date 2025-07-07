package M07_July2025;
/*
Link: https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/description/
1353. Maximum Number of Events That Can Be Attended
 */
import java.util.*;
public class L250707_Medium1353_Maximum_Number_of_Events_That_Can_Be_Attended {
    public int maxEvents(int[][] events) {
        int n = events.length;
        int maxDay = 0;
        for (int[] event : events) {
            maxDay = Math.max(maxDay, event[1]);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int ans = 0;
        for (int i = 1, j = 0; i <= maxDay; i++) {
            while (j < n && events[j][0] <= i) {
                pq.offer(events[j][1]);
                j++;
            }
            while (!pq.isEmpty() && pq.peek() < i) {
                pq.poll();
            }
            if (!pq.isEmpty()) {
                pq.poll();
                ans++;
            }
        }

        return ans;
    }
    // time = O((T+n)logn).
    // space = O(n).
}
