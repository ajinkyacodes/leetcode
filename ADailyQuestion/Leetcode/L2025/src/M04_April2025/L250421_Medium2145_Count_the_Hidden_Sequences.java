package M04_April2025;
/*
Link: https://leetcode.com/problems/count-the-hidden-sequences/description/
2145. Count the Hidden Sequences
 */
public class L250421_Medium2145_Count_the_Hidden_Sequences {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int x = 0, y = 0, cur = 0;
        for (int d : differences) {
            cur += d;
            x = Math.min(x, cur);
            y = Math.max(y, cur);
            if (y - x > upper - lower) {
                return 0;
            }
        }
        return (upper - lower) - (y - x) + 1;
    }
    // time = O(n)
    // space = O(1)
}
