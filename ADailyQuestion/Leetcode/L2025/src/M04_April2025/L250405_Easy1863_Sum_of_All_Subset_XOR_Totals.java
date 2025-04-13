package M04_April2025;
/*
Link: https://leetcode.com/problems/sum-of-all-subset-xor-totals/description/
1863. Sum of All Subset XOR Totals
 */
public class L250405_Easy1863_Sum_of_All_Subset_XOR_Totals {
    public int subsetXORSum(int[] nums) {
        int result = 0;
        // Capture each bit that is set in any of the elements
        for (int num : nums) {
            result |= num;
        }
        // Multiply by the number of subset XOR totals that will have each bit set
        return result << (nums.length - 1);
    }
    // time = O(n)
    // space = O(1)
}
