package Leetcode75;
/*
Link: https://leetcode.com/problems/daily-temperatures/description/
739. Daily Temperatures
 */
public class L75_Medium739_Daily_Temperatures {
    // Approach: Array, Optimized Space
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int hottest = 0;
        int answer[] = new int[n];

        for (int currDay = n - 1; currDay >= 0; currDay--) {
            int currentTemp = temperatures[currDay];
            if (currentTemp >= hottest) {
                hottest = currentTemp;
                continue;
            }

            int days = 1;
            while (temperatures[currDay + days] <= currentTemp) {
                // Use information from answer to search for the next warmer day
                days += answer[currDay + days];
            }
            answer[currDay] = days;
        }

        return answer;
    }
    // time = O(n)
    // space = O(1)
}
