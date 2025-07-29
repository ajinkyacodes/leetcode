package M07_July2025;
/*
Link: https://leetcode.com/problems/smallest-subarrays-with-maximum-bitwise-or/description/
2411. Smallest Subarrays With Maximum Bitwise OR
 */
import java.util.*;
public class L250729_Medium2411_Smallest_Subarrays_With_Maximum_Bitwise_OR {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] pos = new int[31];
        Arrays.fill(pos, -1);
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; --i) {
            int j = i;
            for (int bit = 0; bit < 31; ++bit) {
                if ((nums[i] & (1 << bit)) == 0) {
                    if (pos[bit] != -1) {
                        j = Math.max(j, pos[bit]);
                    }
                } else {
                    pos[bit] = i;
                }
            }
            ans[i] = j - i + 1;
        }
        return ans;
    }
    // time = O(n×logC).
    // space = O(logC)
}
