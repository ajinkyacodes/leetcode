package M03_March2025;
/*
Link: https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/description/
1780. Check if Number is a Sum of Powers of Three
 */
public class L250304_Medium1780_Check_if_Number_is_a_Sum_of_Powers_of_Three {
    // Approach: Optimized Iterative Approach
    public boolean checkPowersOfThree(int n) {
        int power = 0;

        // Find the largest power that is smaller or equal to n
        while (Math.pow(3, power) <= n) {
            power++;
        }

        while (n > 0) {
            // Subtract current power from n
            if (n >= Math.pow(3, power)) {
                n -= (int) Math.pow(3, power);
            }
            // We cannot use the same power twice
            if (n >= Math.pow(3, power)) {
                return false;
            }
            // Move to the next lower power
            power--;
        }

        // n has reached 0
        return true;
    }
    // time = O(log b3 n)
    // space = O(1)
}
