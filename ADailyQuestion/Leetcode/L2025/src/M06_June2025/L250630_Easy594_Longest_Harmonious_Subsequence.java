package M06_June2025;
/*
Link: https://leetcode.com/problems/longest-harmonious-subsequence/description/
594. Longest Harmonious Subsequence
 */
import java.util.*;
public class L250630_Easy594_Longest_Harmonious_Subsequence {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int prev_count = 1, res = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            if (i > 0 && nums[i] - nums[i - 1] == 1) {
                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    count++;
                    i++;
                }
                res = Math.max(res, count + prev_count);
                prev_count = count;
            } else {
                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    count++;
                    i++;
                }
                prev_count = count;
            }
        }
        return res;
    }
    // time = O(nlogn).
    // space = O(nlogn).
}
