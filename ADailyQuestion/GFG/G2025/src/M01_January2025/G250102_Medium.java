package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/subarrays-with-sum-k/1
Subarrays with sum K
Topics: Array, Hash
 */
import java.util.HashMap;
public class G250102_Medium {
    public static int countSubarrays(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, sum = 0;
        for (int num : arr) {
            sum += num;
            count += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    // TC = O(N)
    // SC = O(N)

    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;
        System.out.println(countSubarrays(arr, k)); // 3
    }
}
