package M03_March2025;
/*
Link: https://leetcode.com/problems/apply-operations-to-an-array/description/
2460. Apply Operations to an Array
Approach: One Pass
 */
public class L250301_Easy2460_Apply_Operations_to_an_Array {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int writeIndex = 0; // Pointer to place non-zero elements

        for (int index = 0; index < n; index++) {
            // Step 1: Merge adjacent equal elements if they are non-zero
            if (
                    index < n - 1 &&
                            nums[index] == nums[index + 1] &&
                            nums[index] != 0
            ) {
                nums[index] *= 2;
                nums[index + 1] = 0;
            }

            // Step 2: Shift non-zero elements to the front
            if (nums[index] != 0) {
                if (index != writeIndex) {
                    int temp = nums[index];
                    nums[index] = nums[writeIndex];
                    nums[writeIndex] = temp;
                }
                writeIndex++;
            }
        }

        return nums;
    }
    // time = O(n)
    // space = O(1)
}
