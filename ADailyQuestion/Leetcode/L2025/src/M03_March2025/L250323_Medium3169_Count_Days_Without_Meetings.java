package M03_March2025;
/*
Link: https://leetcode.com/problems/count-days-without-meetings/description/
3169. Count Days Without Meetings
 */
import java.util.*;
public class L250323_Medium3169_Count_Days_Without_Meetings {
    // Approach 2: Sorting
    public int countDays(int days, int[][] meetings) {
        int freeDays = 0, latestEnd = 0;

        // Sort meetings based on starting times
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        for (int[] meeting : meetings) {
            int start = meeting[0], end = meeting[1];

            // Add current range of days without a meeting
            if (start > latestEnd + 1) {
                freeDays += start - latestEnd - 1;
            }

            // Update latest meeting end
            latestEnd = Math.max(latestEnd, end);
        }

        // Add all days after the last day of meetings
        freeDays += days - latestEnd;

        return freeDays;
    }
    // time = O(N⋅log(N))
    // space = O(log⁡⁡N) or O(N).
}
