package M06_June2025;
/*
Link: https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/description/
3442. Maximum Difference Between Even and Odd Frequency I
 */
import java.util.*;
public class L250610_Easy3442_Maximum_Difference_Between_Even_and_Odd_Frequency_I {
    public int maxDifference(String s) {
        Map<Character, Integer> c = new HashMap<>();
        for (char ch : s.toCharArray()) {
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }
        int maxOdd = 1, minEven = s.length();
        for (int value : c.values()) {
            if (value % 2 == 1) {
                maxOdd = Math.max(maxOdd, value);
            } else {
                minEven = Math.min(minEven, value);
            }
        }
        return maxOdd - minEven;
    }
    // time = O(n).
    // space = O(∣Σ∣).
}
