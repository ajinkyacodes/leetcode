package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/count-subarray-with-given-xor/1
Count Subarrays with given XOR
Topics: Array, Map
 */
import java.util.HashMap;
import java.util.Map;
public class G250103_Medium_Count_Subarrays_with_given_XOR {
    public static long subarrayXor(int arr[], int k) {
        // Map to store the frequency of prefix XORs
        Map<Integer, Integer> xorMap = new HashMap<>();

        int count = 0;
        int xor = 0;

        for (int num : arr) {
            // Update the running XOR
            xor ^= num;

            // If the running XOR equals k, increment the count
            if (xor == k) {
                count++;
            }

            // Check if there is a prefix XOR that satisfies the condition
            int requiredXOR = xor ^ k;
            if (xorMap.containsKey(requiredXOR)) {
                count += xorMap.get(requiredXOR);
            }

            // Update the frequency of the current XOR in the map
            xorMap.put(xor, xorMap.getOrDefault(xor, 0) + 1);
        }

        return count;
    }
    // TC = O(N)
    // SC = O(N)

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(subarrayXor(arr, k)); // 4
    }
}
