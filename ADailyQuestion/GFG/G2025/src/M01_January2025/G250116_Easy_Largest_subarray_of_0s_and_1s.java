package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/largest-subarray-of-0s-and-1s/1
Largest subarray of 0's and 1's
Topics: Sliding Window, Hash
 */
import java.util.HashMap;
public class G250116_Easy_Largest_subarray_of_0s_and_1s {
    public static int maxLen(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLength = 0;
        int prefixSum = 0;

        // Initialize the map with prefixSum 0 at index -1
        map.put(0,-1);

        for(int i=0; i<n; i++) {
            prefixSum += (arr[i] == 0) ? -1 : 1;

            if(map.containsKey(prefixSum)) {
                // Calculate the length of the subarray
                int length = i - map.get(prefixSum);
                maxLength = Math.max(maxLength, length);
            } else {
                // Store the prefix sum with its index
                map.put(prefixSum, i);
            }
        }
        return maxLength;
    }
    // TC = O(n)
    // SC = O(n)

    public static void main(String[] args) {
        System.out.println(maxLen(new int[]{1, 0, 1, 1, 1, 0, 0})); // 6
        System.out.println(maxLen(new int[]{0, 0, 1, 1, 0})); // 4
        System.out.println(maxLen(new int[]{0})); // 0
    }
}
