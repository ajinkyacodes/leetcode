package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
Longest Subarray with Sum K
Topics: Array, Hash, Map, Prefix Sum
 */
import java.util.*;
public class G250115_Medium_Longest_Subarray_with_Sum_K {
    public static int longestSubarray(int[] arr, int k) {
        // HashMap to store prefix sums and their earliest occurrence
        Map<Long, Integer> prefixSumMap = new HashMap<>();
        long currentSum = 0; // To store the current cumulative sum
        int maxLength = 0; // To store the maximum length of subarray with sum = k

        // Handle the edge case when the subarray starts from index 0
        prefixSumMap.put(0L, -1);

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            // If the subarray from the start has sum = k
            if (currentSum == k) {
                maxLength = i + 1;
            }

            // If (currentSum - k) exists in the map, then subarray with sum = k is found
            if (prefixSumMap.containsKey(currentSum - k)) {
                maxLength = Math.max(maxLength, i - prefixSumMap.get(currentSum - k));
            }

            // Add the current sum to the map if it doesn't already exist
            // to ensure we only use the first occurrence for maximum length calculation
            prefixSumMap.putIfAbsent(currentSum, i);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {94, -33, -13, 40, -82, 94, -33, -13, 40, -82};
        int k1 = 52;
        System.out.println(longestSubarray(arr1, k1)); // Output: 3

        int[] arr2 = {10, 5, 2, 7, 1, -10};
        int k2 = 15;
        System.out.println(longestSubarray(arr2, k2)); // Output: 6

        int[] arr3 = {-5, 8, -14, 2, 4, 12};
        int k3 = -5;
        System.out.println(longestSubarray(arr3, k3)); // Output: 5

        int[] arr4 = {10, -10, 20, 30};
        int k4 = 5;
        System.out.println(longestSubarray(arr4, k4)); // Output: 0
    }
}
