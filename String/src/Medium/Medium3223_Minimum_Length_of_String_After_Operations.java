package Medium;
/*
Link: https://leetcode.com/problems/minimum-length-of-string-after-operations/description/
3223. Minimum Length of String After Operations
Topics: Hash Table, String, Counting
 */
public class Medium3223_Minimum_Length_of_String_After_Operations {
    public static int minimumLength(String s) {
        int[] f = new int[26]; // Frequency array for lowercase English letters
        int count = 0; // Tracks the number of removable characters

        // Iterate through the string
        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - 'a'; // Convert character to an index (0 to 25)
            f[n]++; // Increment the frequency of the character

            // Check if the character becomes removable
            if (f[n] > 2 && f[n] % 2 == 1) {
                count += 2; // Add two removable characters
            }
        }

        // Final length = Original length - Count of removed characters
        return s.length() - count;
    }

    public static void main(String[] args) {
        System.out.println(minimumLength("abaacbcbb")); // 5
    }
}
