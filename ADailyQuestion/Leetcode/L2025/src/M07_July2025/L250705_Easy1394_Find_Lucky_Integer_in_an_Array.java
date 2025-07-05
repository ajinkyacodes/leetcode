package M07_July2025;
/*
Link: https://leetcode.com/problems/find-lucky-integer-in-an-array/description/
1394. Find Lucky Integer in an Array
 */
import java.util.*;
public class L250705_Easy1394_Find_Lucky_Integer_in_an_Array {
    public int findLucky(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        int largestLuckyNumber = -1;

        // Itereate over key-value pairs
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getKey().equals(entry.getValue())) {
                largestLuckyNumber = Math.max(largestLuckyNumber, entry.getKey());
            }
        }
        return largestLuckyNumber;
    }
    // time = O(N)
    // space = O(N)
}
