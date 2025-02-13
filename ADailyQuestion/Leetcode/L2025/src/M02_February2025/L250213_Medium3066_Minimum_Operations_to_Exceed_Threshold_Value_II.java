package M02_February2025;
/*
Link: https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-ii/description/
3066. Minimum Operations to Exceed Threshold Value II
Topic: Priority Queue
 */
import java.util.*;
import java.util.stream.Collectors;

public class L250213_Medium3066_Minimum_Operations_to_Exceed_Threshold_Value_II {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<Long>(
                Arrays.stream(nums)
                        .mapToLong(i -> (long) i)
                        .boxed()
                        .collect(Collectors.toList())
        );
        int numOperations = 0;

        while (minHeap.peek() < k) {
            long x = minHeap.remove();
            long y = minHeap.remove();
            minHeap.add(Math.min(x, y) * 2 + Math.max(x, y));

            numOperations++;
        }
        return numOperations;
    }
    // time = O(n log n)
    // space = O(n)
}
