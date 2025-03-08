package M03_March2025;
/*
Link: https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/
2379. Minimum Recolors to Get K Consecutive Black Blocks
 */
public class L250308_Easy2379_Minimum_Recolors_to_Get_K_Consecutive_Black_Blocks {
    // Approach: Sliding Window
    public int minimumRecolors(String blocks, int k) {
        int left = 0, numWhites = 0, numRecolors = Integer.MAX_VALUE;

        // Move right pointer
        for (int right = 0; right < blocks.length(); right++) {
            // Increment numWhites if block at right pointer is white
            if (blocks.charAt(right) == 'W') {
                numWhites++;
            }

            // k consecutive elements are found
            if (right - left + 1 == k) {
                // Update minumum
                numRecolors = Math.min(numRecolors, numWhites);

                // Decrement numWhites if block at left pointer is white
                if (blocks.charAt(left) == 'W') numWhites--;

                // Move left pointer
                left++;
            }
        }
        return numRecolors;
    }
    // time = O(n)
    // space = O(1)
}
