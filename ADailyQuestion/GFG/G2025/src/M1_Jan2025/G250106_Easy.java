package M1_Jan2025;
/*
Link: https://www.geeksforgeeks.org/problems/pair-in-array-whose-sum-is-closest-to-x1124/1
Sum Pair closest to target
Topics: Array, DSA, Two Pointers
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class G250106_Easy {
    public static List<Integer> sumClosest(int[] arr, int target) {
        List<Integer> result = new ArrayList<>();
        if (arr == null || arr.length < 2) {
            return result; // Return empty list if no pair exists
        }

        // Sort the array
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        int closestSum = Integer.MAX_VALUE;
        int maxAbsDifference = Integer.MIN_VALUE;

        while (left < right) { // Use < instead of <= to avoid invalid pairs
            int sum = arr[left] + arr[right];

            if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                // Update closest sum and the result pair
                closestSum = sum;
                result.clear();
                result.add(arr[left]);
                result.add(arr[right]);
                maxAbsDifference = arr[right] - arr[left];
            } else if (Math.abs(target - sum) == Math.abs(target - closestSum)) {
                // If the same closest sum, choose the pair with max absolute difference
                if ((arr[right] - arr[left]) > maxAbsDifference) {
                    result.clear();
                    result.add(arr[left]);
                    result.add(arr[right]);
                    maxAbsDifference = arr[right] - arr[left];
                } else if ((arr[right] - arr[left]) == maxAbsDifference) {
                    // If maxAbsDifference is the same, prioritize smaller numbers
                    if (arr[left] < result.get(0) || (arr[left] == result.get(0) && arr[right] < result.get(1))) {
                        result.clear();
                        result.add(arr[left]);
                        result.add(arr[right]);
                    }
                }
            }

            // Move pointers based on the sum
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
    // TC = O(N log N)
    // SC = O(1)

    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 4};
        int target = 10;
        List<Integer> result = new ArrayList<Integer>();
        result = sumClosest(arr, target);
        for(int i=0; i<result.size(); i++){
            System.out.println(result.get(i)+" "); // [2, 7]
        }
    }
}
