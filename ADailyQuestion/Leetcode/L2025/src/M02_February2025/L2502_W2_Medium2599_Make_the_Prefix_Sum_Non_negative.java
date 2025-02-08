package M02_February2025;
/*
Link:
2599. Make the Prefix Sum Non-negative
Topic: Greedy
 */
import java.util.*;
public class L2502_W2_Medium2599_Make_the_Prefix_Sum_Non_negative {
    public static int makePrefSumNonNegative(int[] nums) {
        int operations = 0;
        long prefixSum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            // Push negative elements to the min heap.
            if (num < 0) {
                pq.offer(num);
            }

            prefixSum += num;
            // Pop the minimum element from the heap and subtract from the sum.
            if (prefixSum < 0) {
                prefixSum -= pq.poll();
                // Increment the operations required.
                operations++;
            }
        }

        return operations;
    }
    // time = O(n log n)
    // space = O(n)

    public static void main(String[] args) {
        System.out.println(makePrefSumNonNegative(new int[]{2,3,-5,4})); // 0
        System.out.println(makePrefSumNonNegative(new int[]{3,-5,-2,6})); // 1
    }
}
