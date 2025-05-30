package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/count-pairs-whose-sum-is-less-than-target/1
Count Pairs whose sum is less than target
Topics: Array, DSA, Two Pointers
 */
import java.util.Arrays;
public class G250105_Easy_Count_Pairs_whose_sum_is_less_than_target {
    public static int countPairs(int arr[], int target) {
        // Sort Array
        Arrays.sort(arr);

        int count = 0;
        int left = 0;
        int right = arr.length-1;

        while(left<right) {
            int sum = arr[left]+arr[right];

            if(sum < target) {
                count += right-left;
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
    // TC = O(N Log N)
    // Sc = O(1)

    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 3};
        int target = 8;
        System.out.println(countPairs(arr, target)); // 2
    }
}
