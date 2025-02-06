package M02_February2025;
/*
Link: https://leetcode.com/problems/tuple-with-same-product/description/
1726. Tuple with Same Product
Topic: Hash Table
 */
import java.util.*;
public class L250206_Medium1726_Tuple_with_Same_Product {
    public static int tupleSameProduct(int[] nums) {
        int numsLength = nums.length;

        // Initialize a map to store the frequency of each product of pairs
        Map<Integer, Integer> pairProductsFrequency = new HashMap<>();

        int totalNumberOfTuples = 0;

        // Iterate through each pair of numbers in `nums`
        for (int firstIndex = 0; firstIndex < numsLength; firstIndex++) {
            for (
                    int secondIndex = firstIndex + 1;
                    secondIndex < numsLength;
                    secondIndex++
            ) {
                // Increment the frequency of the product of the current pair
                pairProductsFrequency.put(
                        nums[firstIndex] * nums[secondIndex],
                        pairProductsFrequency.getOrDefault(
                                nums[firstIndex] * nums[secondIndex],
                                0
                        ) +
                                1
                );
            }
        }

        // Iterate through each product value and its frequency in the map
        for (int productValue : pairProductsFrequency.keySet()) {
            int productFrequency = pairProductsFrequency.get(productValue);
            // Calculate the number of ways to choose two pairs with the same product
            int pairsOfEqualProduct =
                    ((productFrequency - 1) * productFrequency) / 2;

            // Add the number of tuples for this product to the total (each pair
            // can form 8 tuples)
            totalNumberOfTuples += 8 * pairsOfEqualProduct;
        }

        return totalNumberOfTuples;
    }
    // time = O(n^2)
    // space = O(n^2)

    public static void main(String[] args) {
        System.out.println(tupleSameProduct(new int[]{2,3,4,6})); // 8
        System.out.println(tupleSameProduct(new int[]{1,2,4,5,10})); // 16
    }
}
