package M06_June2025;
/*
Link: https://leetcode.com/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/description/
3423. Maximum Difference Between Adjacent Elements in a Circular Array
 */
public class L250612_Easy3423_Maximum_Difference_Between_Adjacent_Elements_in_a_Circular_Array {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int maxDiff = 0;
        int j = 0;
        for(int i=1; i<n; i++){
            if(j < n-1) {
                int diff = Math.abs(nums[i]-nums[j]);
                j++;
                maxDiff = Math.max(maxDiff, diff);
            }
        }
        int adjDiff = Math.abs(nums[n-1] - nums[0]);
        return Math.max(maxDiff, adjDiff);
    }
    // time = O(n)
    // space = O(1)
}
