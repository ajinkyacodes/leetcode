package M03_March2025;
/*
Link: https://leetcode.com/problems/partition-array-according-to-given-pivot/description/
2161. Partition Array According to Given Pivot
 */
public class L250303_Medium2161_Partition_Array_According_to_Given_Pivot {
    // Approach: Two Passes With Fixed Array
    public int[] pivotArray(int[] nums, int pivot) {
        int less = 0;
        int equal = 0;
        for (int num : nums) {
            if (num < pivot) less++;
            else if (num == pivot) equal++;
        }

        int[] ans = new int[nums.length];
        int lessI = 0;
        int equalI = less;
        int greaterI = less + equal;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num < pivot) {
                ans[lessI] = num;
                lessI++;
            } else if (num > pivot) {
                ans[greaterI] = num;
                greaterI++;
            } else {
                ans[equalI] = num;
                equalI++;
            }
        }
        return ans;
    }
    // time = O(n)
    // space = O(1)
}
