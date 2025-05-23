package M03_March2025;
/*
Link:
1100. Find K-Length Substrings With No Repeated Characters
 */
public class L2503_W2_Medium1100_Find_K_Length_Substrings_With_No_Repeated_Characters {
    // Approach: Sliding Window
    public int numKLenSubstrNoRepeats(String s, int k) {
        // We can reuse the condition from the first approach
        // as for k > 26, there can be no substrings with only unique characters
        if (k > 26) return 0;

        int answer = 0;
        int n = s.length();

        // Initializing the left and right pointers
        int left = 0, right = 0;
        // Initializing an empty frequency array
        int freq[] = new int[26];

        while (right < n) {
            // Add the current character in the frequency array
            freq[s.charAt(right) - 'a']++;

            // If the current character appears more than once in the frequency array
            // keep contracting the window and removing characters from the
            // frequency array till the frequency of the current character becomes 1.
            while (freq[s.charAt(right) - 'a'] > 1) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }

            // Check if the length of the current unique substring is equal to k
            if (right - left + 1 == k) {
                answer++;

                // Contract the window and remove the leftmost character from the
                // frequency array
                freq[s.charAt(left) - 'a']--;
                left++;
            }

            // Expand the window
            right++;
        }

        return answer;
    }
    // time = O(n)
    // space = O(m)
}
