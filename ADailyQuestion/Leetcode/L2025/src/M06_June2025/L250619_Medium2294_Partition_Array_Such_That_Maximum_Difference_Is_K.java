package M06_June2025;
/*
Link: https://leetcode.com/problems/partition-array-such-that-maximum-difference-is-k/description/
2294. Partition Array Such That Maximum Difference Is K
 */
import java.util.*;
public class L250619_Medium2294_Partition_Array_Such_That_Maximum_Difference_Is_K {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 1;
        int rec = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - rec > k) {
                ans++;
                rec = nums[i];
            }
        }
        return ans;
    }
    // time = O(nlogn).
    // space = O(n).
}
