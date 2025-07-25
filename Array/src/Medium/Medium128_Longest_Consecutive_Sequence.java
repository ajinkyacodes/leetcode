package Medium;
/*
Link: https://leetcode.com/problems/longest-consecutive-sequence/description/
128. Longest Consecutive Sequence
 */
import java.util.Arrays;
public class Medium128_Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if(n == 0){
            return 0;
        }

        Arrays.sort(nums);

        int longestStreak = 1;
        int currentStreak = 1;

        for(int i=1; i<n; i++) {
            if(nums[i] != nums[i-1]){
                if(nums[i] == nums[i-1]+1){
                    currentStreak += 1;
                } else {
                    longestStreak = Math.max(longestStreak, currentStreak);
                    currentStreak = 1;
                }
            }
        }
        return Math.max(longestStreak, currentStreak);
    }
    // time = O(n log n)
    // space = O(n)
}
