package M04_April2025;
/*
Link: https://leetcode.com/problems/count-the-number-of-good-subarrays/description/
2537. Count the Number of Good Subarrays
 */
import java.util.*;
public class L250416_Medium2537_Count_the_Number_of_Good_Subarrays {
    public long countGood(int[] nums, int k) {
        int n = nums.length;
        int same = 0, right = -1;
        HashMap<Integer, Integer> cnt = new HashMap<>();
        long ans = 0;
        for (int left = 0; left < n; ++left) {
            while (same < k && right + 1 < n) {
                ++right;
                same += cnt.getOrDefault(nums[right], 0);
                cnt.put(nums[right], cnt.getOrDefault(nums[right], 0) + 1);
            }
            if (same >= k) {
                ans += n - right;
            }
            cnt.put(nums[left], cnt.get(nums[left]) - 1);
            same -= cnt.get(nums[left]);
        }
        return ans;
    }
    // time = O(n)
    // space = O(n)
}
