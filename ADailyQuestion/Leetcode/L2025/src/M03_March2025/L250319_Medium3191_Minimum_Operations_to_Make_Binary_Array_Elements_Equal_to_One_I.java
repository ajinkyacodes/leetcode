package M03_March2025;
/*
Link: https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-i/description/
3191. Minimum Operations to Make Binary Array Elements Equal to One I
 */
public class L250319_Medium3191_Minimum_Operations_to_Make_Binary_Array_Elements_Equal_to_One_I {
    // Approach 3: Bit Manipulation & Greedy
    public int minOperations(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i <= n - 3; i++) {
            if (nums[i] == 0) {
                nums[i] = 1;
                nums[i + 1] = nums[i + 1] == 0 ? 1 : 0;
                nums[i + 2] = nums[i + 2] == 0 ? 1 : 0;
                count++;
            }
        }

        if (nums[n - 2] == 0 || nums[n - 1] == 0) return -1;
        return count;
    }
    // TC = O(n)
    // SC = O(1)
}
