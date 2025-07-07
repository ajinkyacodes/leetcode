package Easy;
/*
Link: https://leetcode.com/problems/missing-number/description/
268. Missing Number
 */
public class Easy268_Missing_Number {
    // Approach: Bit Manipulation
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for(int i = 0; i< nums.length; i++){
            missing ^= i ^ nums[i];
        }
        return missing;
    }
    // time = O(n)
    // space = O(1)
}
