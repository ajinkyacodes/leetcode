package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
Indexes of Subarray Sum
Topics: Array, Searching, Prefix Sum Sliding Window
 */
import java.util.ArrayList;
public class G250109_Medium_Indexes_of_Subarray_Sum {
    public static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int n = arr.length;
        int left = 0, sum = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            // Shrink the window if the sum exceeds the target
            while (sum > target && left <= right) {
                sum -= arr[left++];
            }

            // Check if we found the target sum
            if (sum == target) {
                result.add(left + 1); // Add 1-based start index
                result.add(right + 1); // Add 1-based end index
                return result;
            }
        }

        result.add(-1); // No subarray found
        return result;
    }
    // TC = O(N)
    // SC = O(1)

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        ArrayList<Integer> result = subarraySum(arr, target);
        for(int i=0; i<result.size(); i++) {
            System.out.print(result.get(i)+" "); // [2, 4]
        }
    }
}
