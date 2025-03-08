package Leetcode75;
/*
Link: https://leetcode.com/problems/single-number/description/
136. Single Number
 */
import java.util.*;
public class L68_Easy136_Single_Number {
    // Approach: Hash Table
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash_table = new HashMap<>();

        for (int i : nums) {
            hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
        }
        for (int i : nums) {
            if (hash_table.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }
    // time = O(n)
    // space = O(1)
}
