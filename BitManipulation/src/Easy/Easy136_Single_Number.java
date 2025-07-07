package Easy;
/*
Link: https://leetcode.com/problems/single-number/description/
136. Single Number
 */
public class Easy136_Single_Number {
    // Approach: Bit Manipulation
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums) {
            result ^= num;
        }
        return result;
    }
    // time = O(n)
    // space = O(1)
}
