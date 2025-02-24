package M02_February2025;
/*
Link: https://leetcode.com/problems/max-consecutive-ones-ii/description/
487. Max Consecutive Ones II
 */
public class L2502_W4_Medium487_Max_Consecutive_Ones_II {
    public int findMaxConsecutiveOnes(int[] nums) {
        int longestSequence = 0;
        int left = 0;
        int right = 0;
        int numZeroes = 0;

        // While our window is in bounds
        while (right < nums.length) {

            // Increase numZeroes if the rightmost element is 0
            if (nums[right] == 0) {
                numZeroes++;
            }

            //If our window is invalid, contract our window
            while (numZeroes == 2) {
                if (nums[left] == 0) {
                    numZeroes--;
                }
                left++;
            }

            // Update our longest sequence answer
            longestSequence = Math.max(longestSequence, right - left + 1);

            // Expand our window
            right++;
        }
        return longestSequence;
    }
    // time = O(n)
    // space = O(1)
}
