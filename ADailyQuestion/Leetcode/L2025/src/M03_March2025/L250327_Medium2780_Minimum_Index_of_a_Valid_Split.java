package M03_March2025;

/*
Link: https://leetcode.com/problems/minimum-index-of-a-valid-split/description/
2780. Minimum Index of a Valid Split
 */
import java.util.*;
public class L250327_Medium2780_Minimum_Index_of_a_Valid_Split {
    public int minimumIndex(List<Integer> nums) {
        // Find the majority element
        int x = nums.get(0), count = 0, xCount = 0, n = nums.size();

        for (int num : nums) {
            if (num == x) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                x = num;
                count = 1;
            }
        }

        // Count frequency of majority element
        for (int num : nums) {
            if (num == x) {
                xCount++;
            }
        }

        // Check if valid split is possible
        count = 0;
        for (int index = 0; index < n; index++) {
            if (nums.get(index) == x) {
                count++;
            }
            int remainingCount = xCount - count;
            // Check if both left and right partitions satisfy the condition
            if (count * 2 > index + 1 && remainingCount * 2 > n - index - 1) {
                return index;
            }
        }

        return -1;
    }
    // time = O(N)
    // space = O(1)
}
