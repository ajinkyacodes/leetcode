package M07_July2025;
/*
Link: https://leetcode.com/problems/maximum-erasure-value/description/
1695. Maximum Erasure Value
 */
public class L250722_Medium1695_Maximum_Erasure_Value {
    public int maximumUniqueSubarray(int[] nums) {
        int start = 0;
        int result = 0;
        int currentSum = 0;
        int k = 10001;
        int[] countMap = new int[k];
        for (int end = 0; end < nums.length; end++) {
            int currentElement = nums[end];
            countMap[currentElement]++;
            currentSum += currentElement;
            while (start < end && countMap[currentElement] > 1) {
                countMap[nums[start]]--;
                currentSum -= nums[start];
                start++;
            }
            // update result with maximum sum found so far
            result = Math.max(result, currentSum);
        }
        return result;
        // time = O(n)
        // space = O(k)
    }
}
