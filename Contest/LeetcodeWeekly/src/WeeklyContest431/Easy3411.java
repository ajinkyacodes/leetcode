package WeeklyContest431;
/*
Link: https://leetcode.com/problems/maximum-subarray-with-equal-products/description/
3411. Maximum Subarray With Equal Products
Topics: Array, Math, Sliding Window, Enumeration, Number Theory
 */
public class Easy3411 {

    // Helper function to compute GCD of two numbers
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Helper function to compute LCM of two numbers
    private static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public static int maxLength(int[] nums) {
        int n = nums.length;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            int prod = 1;
            int currGcd = nums[i];
            int currLcm = nums[i];

            for (int j = i; j < n; j++) {
                prod *= nums[j];
                currGcd = gcd(currGcd, nums[j]);
                currLcm = lcm(currLcm, nums[j]);

                // Check if the current subarray is product equivalent
                if (prod == currLcm * currGcd) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }
    // TC = O(N^2)
    // SC = O(1)

    public static void main(String[] args) {
        int[] nums = {1,2,1,2,1,1,1};
        System.out.println(maxLength(nums)); // 5
    }
}
