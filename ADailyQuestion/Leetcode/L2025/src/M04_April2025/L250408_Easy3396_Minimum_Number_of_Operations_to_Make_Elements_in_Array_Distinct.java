package M04_April2025;
/*
Link: https://leetcode.com/problems/minimum-number-of-operations-to-make-elements-in-array-distinct/description/
3396. Minimum Number of Operations to Make Elements in Array Distinct
 */
public class L250408_Easy3396_Minimum_Number_of_Operations_to_Make_Elements_in_Array_Distinct {
    public int minimumOperations(int[] nums) {
        boolean[] seen = new boolean[128];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (seen[nums[i]]) {
                return i / 3 + 1;
            }
            seen[nums[i]] = true;
        }
        return 0;
    }
    // time = O(n)
    // space = O(n)
}
