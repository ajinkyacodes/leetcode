package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/1
Longest substring with distinct characters
Topics: Strings
 */
import java.util.HashSet;
public class G250111_Easy {
    public static int longestUniqueSubstr(String s) {
        int n = s.length();
        int left = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        for(int right=0; right<n; right++) {
            // If the character is already present then remove chars from left
            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character to the set
            set.add(s.charAt(right));

            // Update Max Length
            maxLength = Math.max(maxLength, right-left+1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(longestUniqueSubstr(s)); // 7
    }
}
