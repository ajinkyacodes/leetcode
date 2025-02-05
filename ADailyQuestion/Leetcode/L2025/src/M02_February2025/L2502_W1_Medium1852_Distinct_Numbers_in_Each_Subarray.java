package M02_February2025;
/*
Link:
1852. Distinct Numbers in Each Subarray
Topic: Hash Table
 */
import java.util.*;
public class L2502_W1_Medium1852_Distinct_Numbers_in_Each_Subarray {
    public static int[] distinctNumbers(int[] nums, int k) {
        int len = nums.length;
        int[] answer = new int[len - k + 1];

        // Map to store number -> frequency count
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Process first window
        for (int pos = 0; pos < k; pos++) {
            freqMap.put(nums[pos], freqMap.getOrDefault(nums[pos], 0) + 1);
        }
        answer[0] = freqMap.size();

        // Slide window and update counts
        for (int pos = k; pos < len; pos++) {
            // Remove leftmost element of previous window
            int leftNum = nums[pos - k];
            freqMap.put(leftNum, freqMap.get(leftNum) - 1);
            freqMap.remove(leftNum, 0);

            // Add rightmost element of current window
            int rightNum = nums[pos];
            freqMap.put(rightNum, freqMap.getOrDefault(rightNum, 0) + 1);

            // Store distinct count for current window
            answer[pos - k + 1] = freqMap.size();
        }

        return answer;
    }
    // time = O(n)
    // space = O(n)

    public static void main(String[] args) {
        System.out.println(Arrays.toString(distinctNumbers(new int[]{1,2,3,2,2,1,3}, 3))); // [3,2,2,2,3]
        System.out.println(Arrays.toString(distinctNumbers(new int[]{1,1,1,1,2,3,4}, 4))); // [1,2,3,4]
    }
}
