package M02_February2025;
/*
Link: https://leetcode.com/problems/special-array-i/description/
Special Array I
Topic: Array
 */
public class L250201_Easy3151_Specia_Array_I {
    public static boolean isArraySpecial(int[] nums) {
        // Iterate through indexes 0 to n - 1
        for (int index = 0; index < nums.length - 1; index++) {
            // Compare the parities of the current and next number
            if (nums[index] % 2 == nums[index + 1] % 2) {
                // If the two adjacent numbers have the same parity, return false
                return false;
            }
        }

        // Return true if no pair of adjacent numbers with the same parity are found
        return true;
    }
    // time = O(n)
    // space = O(1)

    public static void main(String[] args) {
        System.out.println(isArraySpecial(new int[]{1})); // true
        System.out.println(isArraySpecial(new int[]{2,1,4})); // true
        System.out.println(isArraySpecial(new int[]{4,3,1,6})); // false
    }
}
