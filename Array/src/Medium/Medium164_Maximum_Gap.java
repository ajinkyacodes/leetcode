package Medium;
/*
Link: https://leetcode.com/problems/maximum-gap/description/
164. Maximum Gap
 */
import java.util.Arrays;
public class Medium164_Maximum_Gap {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if(nums == null || n<2) return 0;

        Arrays.sort(nums);

        int maxGap = 0;

        for(int i=0; i<n-1; i++){
            maxGap = Math.max(nums[i+1] - nums[i], maxGap);
        }
        return maxGap;
    }
    // time = O(n log n)
    // space = O(1)
}
