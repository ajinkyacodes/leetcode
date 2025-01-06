package Jan2025;
/*
Link : https://leetcode.com/problems/unique-length-3-palindromic-subsequences/description/
1930. Unique Length-3 Palindromic Subsequences
Topics: HashTable, String
Date: 4 January 2025
Solution: https://www.youtube.com/watch?v=0rTkpQC8ytY
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class L250104_Medium1930 {
    public static int countPalindromicSubsequence(String s) {
        int n = s.length();

        // Step 1: Get First & Last occurrences of each char
        Map<Character, int[]> firstLast = new HashMap<>();
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(!firstLast.containsKey(c)){
                firstLast.put(c, new int[]{i,i});
            } else {
                firstLast.get(c)[1]=i;
            }
        }

        // Step 2: Find unique elements count in range
        int count = 0;
        for(Map.Entry<Character, int[]> entry : firstLast.entrySet()){
            int[] range = entry.getValue();
            if(range[0]==range[1]) continue; // No range to consider

            Set<Character> uniqueChars = new HashSet<>();
            for(int i = range[0] + 1; i<range[1]; i++){
                uniqueChars.add(s.charAt(i));
            }
            count += uniqueChars.size();
        }
        return count;
    }
    // TC = O(N)
    // SC = O(1)

    public static void main(String[] args) {
        String a = "aabca"; // 3
        System.out.println(countPalindromicSubsequence(a));
    }
}
