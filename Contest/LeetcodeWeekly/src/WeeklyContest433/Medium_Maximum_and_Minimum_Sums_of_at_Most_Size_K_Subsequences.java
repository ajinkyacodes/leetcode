package WeeklyContest433;
/*
Q2. Maximum and Minimum Sums of at Most Size K Subsequences
 */
import java.util.*;
public class Medium_Maximum_and_Minimum_Sums_of_at_Most_Size_K_Subsequences {
    static final int MOD = 1000000007;

    public static int minMaxSums(int[] nums, int k) {
        Arrays.sort(nums); // Sort the array to calculate contributions effectively
        int n = nums.length;

        // Precompute binomial coefficients modulo MOD
        long[][] binomial = new long[k + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            binomial[0][i] = 1; // C(0, i) = 1
        }
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                binomial[i][j] = (binomial[i - 1][j - 1] + binomial[i][j - 1]) % MOD;
            }
        }

        long result = 0;

        // Calculate contributions as max
        for (int i = 0; i < n; i++) {
            for (int size = 1; size <= k; size++) {
                long count = binomial[size - 1][i]; // C(size - 1, i)
                result = (result + nums[i] * count) % MOD;
            }
        }

        // Calculate contributions as min
        for (int i = 0; i < n; i++) {
            for (int size = 1; size <= k; size++) {
                long count = binomial[size - 1][n - i - 1]; // C(size - 1, n - i - 1)
                result = (result + nums[i] * count) % MOD;
            }
        }

        return (int) result;
    }
    // TC = O(n log n)
    // SC = O(n) ©leetcode

    public static void main(String[] args) {
        System.out.println(minMaxSums(new int[]{1,2,3}, 2)); // 24
        System.out.println(minMaxSums(new int[]{5,0,6}, 1)); // 22
        System.out.println(minMaxSums(new int[]{1,1,1}, 2)); // 12
    }

}
