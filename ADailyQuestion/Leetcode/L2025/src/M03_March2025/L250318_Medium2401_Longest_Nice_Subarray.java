package M03_March2025;
/*
Link: https://leetcode.com/problems/longest-nice-subarray/description/
2401. Longest Nice Subarray
 */
public class L250318_Medium2401_Longest_Nice_Subarray {
    public int longestNiceSubarray(int[] nums) {
        int usedBits = 0; // Tracks bits used in current window
        int windowStart = 0; // Start position of current window
        int maxLength = 0; // Length of longest nice subarray found

        for (int windowEnd = 0; windowEnd < nums.length; ++windowEnd) {
            // If current number shares bits with window, shrink window from left
            // until there's no bit conflict
            while ((usedBits & nums[windowEnd]) != 0) {
                usedBits ^= nums[windowStart]; // Remove leftmost element's bits
                windowStart++;
            }

            // Add current number to the window
            usedBits |= nums[windowEnd];

            // Update max length if current window is longer
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }
    // TC = O(n)
    // SC = O(1)
}

