package M07_July2025;
/*
Link: https://leetcode.com/problems/minimum-difference-in-sums-after-removal-of-elements/description/
2163. Minimum Difference in Sums After Removal of Elements
 */
import java.util.*;
public class L250718_Hard2163_Minimum_Difference_in_Sums_After_Removal_of_Elements {
    public long minimumDifference(int[] nums) {
        int n3 = nums.length;
        int n = n3 / 3;
        long[] part1 = new long[n + 1];
        long sum = 0;
        // max heap (simulate with opposite numbers)
        PriorityQueue<Integer> ql = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < n; ++i) {
            sum += nums[i];
            ql.add(nums[i]);
        }
        part1[0] = sum;
        for (int i = n; i < n * 2; ++i) {
            sum += nums[i];
            ql.add(nums[i]);
            sum -= ql.poll();
            part1[i - (n - 1)] = sum;
        }

        long part2 = 0;
        // min heap
        PriorityQueue<Integer> qr = new PriorityQueue<>();
        for (int i = n * 3 - 1; i >= n * 2; --i) {
            part2 += nums[i];
            qr.add(nums[i]);
        }
        long ans = part1[n] - part2;
        for (int i = n * 2 - 1; i >= n; --i) {
            part2 += nums[i];
            qr.add(nums[i]);
            part2 -= qr.poll();
            ans = Math.min(ans, part1[i - n] - part2);
        }
        return ans;
    }
    // time = O(nlogn).
    // space = O(n)
}
