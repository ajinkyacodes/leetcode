package M04_April2025;

/*
Link: https://leetcode.com/problems/minimum-operations-to-make-array-values-equal-to-k/description/
3375. Minimum Operations to Make Array Values Equal to K
 */
import java.util.*;
public class L250409_Easy3375_Minimum_Operations_to_Make_Array_Values_Equal_to_K {
    public int minOperations(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        for (int x : nums) {
            if (x < k) {
                return -1;
            } else if (x > k) {
                st.add(x);
            }
        }
        return st.size();
    }
    // time = O(n)
    // space = O(n)
}
