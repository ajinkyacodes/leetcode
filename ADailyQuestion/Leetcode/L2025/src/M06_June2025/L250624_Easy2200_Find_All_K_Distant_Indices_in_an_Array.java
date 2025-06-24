package M06_June2025;
/*
Link: https://leetcode.com/problems/find-all-k-distant-indices-in-an-array/description/
2200. Find All K-Distant Indices in an Array
 */
import java.util.*;
public class L250624_Easy2200_Find_All_K_Distant_Indices_in_an_Array {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        // traverse number pairs
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (nums[j] == key && Math.abs(i - j) <= k) {
                    res.add(i);
                    break; // early termination to prevent duplicate addition
                }
            }
        }
        return res;
    }
    // time = O(n^2)
    // space = O(1)
}
