package Leetcode75;
/*
Link: https://leetcode.com/problems/unique-number-of-occurrences/description/
1207. Unique Number of Occurrences
Topics: Array, Hash Map
 */
import java.util.*;
public class L21_Easy1207_Unique_Number_of_Occurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        // Inserting Value, Count in the map
        for(int i=0; i<n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();
    }
    // Time = O(n)
    // Space = O(n)

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,2,2,1,1,3})); // true
        System.out.println(uniqueOccurrences(new int[]{1,2})); // false
        System.out.println(uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0})); // true
    }
}
