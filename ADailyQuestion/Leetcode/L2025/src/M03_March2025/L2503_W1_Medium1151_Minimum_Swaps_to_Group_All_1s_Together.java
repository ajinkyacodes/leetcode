package M03_March2025;

import java.util.Arrays;

/*
Link: https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together/description/
1151. Minimum Swaps to Group All 1's Together
 */
public class L2503_W1_Medium1151_Minimum_Swaps_to_Group_All_1s_Together {
    public int minSwaps(int[] data) {
        int ones = Arrays.stream(data).sum();
        int cntOne = 0, maxOne = 0;
        int left = 0, right = 0;

        while (right < data.length) {
            // Updating the number of 1's by adding the new element
            cntOne += data[right++];
            // Maintain the length of the window to ones
            if (right - left > ones) {
                // Updating the number of 1's by removing the oldest element
                cntOne -= data[left++];
            }
            // Record the maximum number of 1's in the window
            maxOne = Math.max(maxOne, cntOne);
        }
        return ones - maxOne;
    }
    // time = O(n)
    // space = O(1)
}
