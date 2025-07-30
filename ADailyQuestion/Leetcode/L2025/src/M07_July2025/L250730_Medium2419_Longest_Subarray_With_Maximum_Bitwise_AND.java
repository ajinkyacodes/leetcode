package M07_July2025;

/*
Link: https://leetcode.com/problems/longest-subarray-with-maximum-bitwise-and/description/
2419. Longest Subarray With Maximum Bitwise AND
 */
public class L250730_Medium2419_Longest_Subarray_With_Maximum_Bitwise_AND {
    public int longestSubarray(int[] nums) {
        int maxVal = 0, ans = 0, currentStreak = 0;

        for (int num : nums) {
            if (maxVal < num) {
                maxVal = num;
                ans = currentStreak = 0;
            }

            if (maxVal == num) {
                currentStreak++;
            } else {
                currentStreak = 0;
            }

            ans = Math.max(ans, currentStreak);
        }
        return ans;
    }
    // time = O(N)
    // space = O(1)
}
