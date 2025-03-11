package M03_March2025;
/*
Link: https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/
1358. Number of Substrings Containing All Three Characters
 */
public class L250311_Medium1358_Number_of_Substrings_Containing_All_Three_Characters {
    // Approach: Sliding Window
    public int numberOfSubstrings(String s) {
        int len = s.length();
        int left = 0, right = 0;
        // Track frequency of a, b, c
        int[] freq = new int[3];
        int total = 0;

        while (right < len) {
            // Add character at right pointer to frequency array
            char curr = s.charAt(right);
            freq[curr - 'a']++;

            // While we have all required characters
            while (hasAllChars(freq)) {
                // All substrings from current window to end are valid
                // Add count of these substrings to result
                total += len - right;

                // Remove leftmost character and move left pointer
                char leftChar = s.charAt(left);
                freq[leftChar - 'a']--;
                left++;
            }

            right++;
        }

        return total;
    }

    private boolean hasAllChars(int[] freq) {
        // Check if we have at least one of each character
        return freq[0] > 0 && freq[1] > 0 && freq[2] > 0;
    }
    // time = O(n)
    // space = O(1)
}
