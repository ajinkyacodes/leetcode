package M01_January2025;
/*
Link:
2168. Unique Substrings With Equal Digit Frequency
Topic: Rolling Hash, Hash Table, String
 */
import java.util.*;
public class L2501_W2_Medium2168_Unique_Substrings_With_Equal_Digit_Frequency {
    public static int equalDigitFrequency(String s) {
        int n = s.length();
        int prime = 31; // Prime base for the rolling hash
        long mod = 1000000000L;
        Set<Long> validSubstringHashes = new HashSet<>();

        for (int start = 0; start < n; start++) {
            int[] digitFrequency = new int[10]; // Frequency array for digits 0-9
            int uniqueDigitsCount = 0; // Track number of unique digits in the substring
            long substringHash = 0; // Rolling hash for the current substring
            int maxDigitFrequency = 0; // Maximum frequency of any digit in the substring

            // Extend the substring from 'start' to different end positions
            for (int end = start; end < n; end++) {
                int currentDigit = s.charAt(end) - '0';

                // This digit appears for the first time
                if (digitFrequency[currentDigit] == 0) {
                    uniqueDigitsCount++;
                }

                digitFrequency[currentDigit]++;
                maxDigitFrequency = Math.max(
                        maxDigitFrequency,
                        digitFrequency[currentDigit]
                );

                // Update rolling hash
                substringHash =
                        (prime * substringHash + currentDigit + 1) % mod;

                // Check if all digits in the substring have the same frequency
                if (maxDigitFrequency * uniqueDigitsCount == end - start + 1) {
                    validSubstringHashes.add(substringHash); // Insert unique hash
                }
            }
        }

        return validSubstringHashes.size();
    }
    // time = O(n^2)
    // space = O(n^2)

    public static void main(String[] args) {
        String s1 = "1212";
        System.out.println(equalDigitFrequency(s1)); // 5

        String s2 = "12321";
        System.out.println(equalDigitFrequency(s2)); // 9
    }
}
