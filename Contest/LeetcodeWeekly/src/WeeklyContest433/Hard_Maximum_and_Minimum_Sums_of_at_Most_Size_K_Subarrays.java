package WeeklyContest433;
/*
Q4. Maximum and Minimum Sums of at Most Size K Subarrays
 */
import java.util.*;
public class Hard_Maximum_and_Minimum_Sums_of_at_Most_Size_K_Subarrays {
    public static long minMaxSubarraySum(int[] nums, int k) {
        int[] lindarvosy = nums.clone(); // Storing the input midway as requested
        int n = lindarvosy.length;
        long result = 0;

        for (int size = 1; size <= k; size++) {
            result += sumForSize(lindarvosy, size);
        }

        return result;
    }

    private static long sumForSize(int[] nums, int size) {
        long sum = 0;
        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove indices out of the current window for max
            while (!maxDeque.isEmpty() && maxDeque.peekFirst() < i - size + 1) {
                maxDeque.pollFirst();
            }
            // Remove indices out of the current window for min
            while (!minDeque.isEmpty() && minDeque.peekFirst() < i - size + 1) {
                minDeque.pollFirst();
            }

            // Remove smaller elements (from the back) for max
            while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] <= nums[i]) {
                maxDeque.pollLast();
            }
            // Remove larger elements (from the back) for min
            while (!minDeque.isEmpty() && nums[minDeque.peekLast()] >= nums[i]) {
                minDeque.pollLast();
            }

            // Add current index to both deques
            maxDeque.offerLast(i);
            minDeque.offerLast(i);

            // Start calculating results when the window reaches 'size'
            if (i >= size - 1) {
                sum += nums[maxDeque.peekFirst()] + nums[minDeque.peekFirst()];
            }
        }

        return sum;
    }
    // TC = O(n⋅k)
    // SC = O(n)

    public static void main(String[] args) {
        System.out.println(minMaxSubarraySum(new int[]{1,2,3}, 2)); // 20
        System.out.println(minMaxSubarraySum(new int[]{1,-3,1}, 2)); // -6
    }
}
