package M04_April2025;
/*
Link: https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/description/
2962. Count Subarrays Where Max Element Appears at Least K Times
 */
import java.util.*;
public class L250429_Medium2962_Count_Subarrays_Where_Max_Element_Appears_at_Least_K_Times {
    public long countSubarrays(int[] nums, int k) {
        int maxElement = Arrays.stream(nums).max().getAsInt();
        long ans = 0, start = 0;
        int maxElementsInWindow = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == maxElement) {
                maxElementsInWindow++;
            }
            while (maxElementsInWindow == k) {
                if (nums[(int) start] == maxElement) {
                    maxElementsInWindow--;
                }
                start++;
            }
            ans += start;
        }
        return ans;
    }
    // time = O(n)
    // space = O(1)
}
