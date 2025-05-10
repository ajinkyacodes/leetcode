package M05_May2025;
/*
Link: https://leetcode.com/problems/minimum-equal-sum-of-two-arrays-after-replacing-zeros/description/
2918. Minimum Equal Sum of Two Arrays After Replacing Zeros
 */
public class L250510_Medium2918_Minimum_Equal_Sum_of_Two_Arrays_After_Replacing_Zeros {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0, sum2 = 0;
        long zero1 = 0, zero2 = 0;

        for (int i : nums1) {
            sum1 += i;
            if (i == 0) {
                sum1++;
                zero1++;
            }
        }

        for (int i : nums2) {
            sum2 += i;
            if (i == 0) {
                sum2++;
                zero2++;
            }
        }

        if ((zero1 == 0 && sum2 > sum1) || (zero2 == 0 && sum1 > sum2)) {
            return -1;
        }

        return Math.max(sum1, sum2);
    }
    // time = O(n+m)
    // space = O(1)
}
