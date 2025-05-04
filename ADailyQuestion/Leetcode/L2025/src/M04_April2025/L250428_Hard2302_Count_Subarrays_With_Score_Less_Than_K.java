package M04_April2025;
/*
Link: https://leetcode.com/problems/count-subarrays-with-score-less-than-k/description/
2302. Count Subarrays With Score Less Than K
 */
public class L250428_Hard2302_Count_Subarrays_With_Score_Less_Than_K {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        long res = 0, total = 0;
        for (int i = 0, j = 0; j < n; j++) {
            total += nums[j];
            while (i <= j && total * (j - i + 1) >= k) {
                total -= nums[i];
                i++;
            }
            res += j - i + 1;
        }
        return res;
    }
    // time = O(n)
    // space = O(1)
}
