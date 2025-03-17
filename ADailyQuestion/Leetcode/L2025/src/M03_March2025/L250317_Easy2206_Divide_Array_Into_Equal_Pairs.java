package M03_March2025;
/*
Link: https://leetcode.com/problems/divide-array-into-equal-pairs/description/
2206. Divide Array Into Equal Pairs
 */
import java.util.*;
public class L250317_Easy2206_Divide_Array_Into_Equal_Pairs {
    // Approach 2: Map
    public boolean divideArray(int[] nums) {
        // Count frequency of each number
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        // Check if each number appears even number of times
        for (int num : frequency.keySet()) {
            if (frequency.get(num) % 2 != 0) {
                return false;
            }
        }

        // All numbers can be paired
        return true;
    }
    // TC = O(n)
    // SC = O(n)
}
