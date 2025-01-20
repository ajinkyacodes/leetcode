package Easy;
/*
Link: https://leetcode.com/problems/squares-of-a-sorted-array/description/
977. Squares of a Sorted Array
 */
import java.util.*;
public class Easy977_Squares_of_a_Sorted_Array {
    public static int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
    // Tc = O(n log n)
    // Sc = O(1)

    public static void main(String[] args) {
        int[] result1 = sortedSquares(new int[]{-4,-1,0,3,10});
        System.out.println(Arrays.toString(result1)); // [0,1,9,16,100]

        int[] result2 = sortedSquares(new int[]{-7,-3,2,3,11});
        System.out.println(Arrays.toString(result2)); // [4,9,9,49,121]
    }
}
