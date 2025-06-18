package M06_June2025;
/*
Link: https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/description/
2966. Divide Array Into Arrays With Max Difference
 */
import java.util.*;
public class L250618_Medium2966_Divide_Array_Into_Arrays_With_Max_Difference {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] ans = new int[nums.length / 3][3];
        for (int i = 0; i < nums.length; i += 3) {
            if (nums[i + 2] - nums[i] > k) {
                return new int[0][0];
            }
            ans[i / 3] = new int[]{nums[i], nums[i + 1], nums[i + 2]};
        }
        return ans;
    }
    // time = O(N⋅logN).
    // space = O(N).
}
