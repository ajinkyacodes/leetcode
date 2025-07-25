package M07_July2025;
/*
Link: https://leetcode.com/problems/maximum-unique-subarray-sum-after-deletion/description/
3487. Maximum Unique Subarray Sum After Deletion
 */
import java.util.*;
public class L250725_Easy3487_Maximum_Unique_Subarray_Sum_After_Deletion {
    public int maxSum(int[] nums) {
        Set<Integer> positiveNumsSet = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                positiveNumsSet.add(num);
            }
        }
        if (positiveNumsSet.isEmpty()) {
            return Arrays.stream(nums).max().getAsInt();
        }
        return positiveNumsSet.stream().mapToInt(Integer::intValue).sum();
    }
    // time = O(n)
    // space = O(n)
}
