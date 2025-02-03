package M02_February2025;
/*
Link:
1752. Check if Array Is Sorted and Rotated
Topic: Array
 */
public class L250202_Easy1752_Check_if_Array_Is_Sorted_and_Rotated {
    public static boolean check(int[] nums) {
        int n = nums.length;
        if (n <= 1) return true;

        int inversionCount = 0;

        // For every pair, count the number of inversions.
        for (int i = 1; i < n; ++i) {
            if (nums[i] < nums[i - 1]) {
                ++inversionCount;
            }
        }

        // Also check between the last and the first element due to rotation
        if (nums[0] < nums[n - 1]) {
            ++inversionCount;
        }

        return inversionCount <= 1;
    }
    // time = O(n)
    // space = O(1)

    public static void main(String[] args) {
        System.out.println(check(new int[]{3,4,5,1,2})); // true
        System.out.println(check(new int[]{2,1,3,4})); // false
        System.out.println(check(new int[]{1,2,3})); // true
    }
}
