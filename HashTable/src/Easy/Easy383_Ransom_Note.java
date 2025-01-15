package Easy;
/*
Link: https://leetcode.com/problems/ransom-note/description/
383. Ransom Note
Topics: String, Hash Table
 */
import java.util.HashMap;
public class Easy383_Ransom_Note {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineCount = new HashMap<>();

        for(int i=0; i<magazine.length(); i++) {
            char m = magazine.charAt(i);

            int currentCount = magazineCount.getOrDefault(m,0);
            magazineCount.put(m, currentCount+1);
        }

        // Checking each letter in magazine can only be used once in ransomNote
        for(int i=0; i<ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);

            int currentCount = magazineCount.getOrDefault(r,0);

            if(currentCount == 0) {
                return false;
            }

            magazineCount.put(r, currentCount-1);
        }
        return true;
    }
    // TC = O(m)
    // SC = O(1)

    public static void main(String[] args) {
        System.out.println(canConstruct("a","b")); // false
        System.out.println(canConstruct("aa","ab")); // false
        System.out.println(canConstruct("aa","aab")); // true
    }
}
