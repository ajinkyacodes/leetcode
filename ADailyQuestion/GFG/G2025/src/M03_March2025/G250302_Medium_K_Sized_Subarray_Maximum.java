package M03_March2025;
/*
Link: https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1
K Sized Subarray Maximum
 */
import java.util.*;
public class G250302_Medium_K_Sized_Subarray_Maximum {
    public ArrayList<Integer> maxOfSubarrays(int arr[], int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            // Remove elements that are out of the current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove smaller elements from the back
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }

            // Add the current index
            deque.offerLast(i);

            // Store the maximum for the current window
            if (i >= k - 1) {
                result.add(arr[deque.peekFirst()]);
            }
        }

        return result;
    }
}
