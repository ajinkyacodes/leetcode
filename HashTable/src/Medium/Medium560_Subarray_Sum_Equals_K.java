package Medium;
/*
Link: https://leetcode.com/problems/subarray-sum-equals-k/description/
560. Subarray Sum Equals K
Topics: Prefix Sum, Hash Table
Solution Explained = https://www.youtube.com/watch?v=eUNDQ6SAJcE
 */

import java.util.HashMap;
import java.util.Map;

public class Medium560_Subarray_Sum_Equals_K {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int currentSum = 0;
        int result = 0;

        // Handle edge cases when the subarray starts from index 0
        map.put(0, 1);

        // Prefix Sum Approach
        for(int i=0; i<nums.length; i++) {
            currentSum += nums[i];
            result += map.getOrDefault(currentSum - k, 0);
            map.put(currentSum, map.getOrDefault(currentSum, 0)+1);
        }
        return result;
    }
    // TC = O(n)
    // SC = O(n)

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,1,1}, 2)); // 2
        System.out.println(subarraySum(new int[]{1,2,3}, 3)); // 2
    }
}
