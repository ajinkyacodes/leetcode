package M04_April2025;
/*
Link: https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/description/
2176. Count Equal and Divisible Pairs in an Array
 */
public class L250417_Easy2176_Count_Equal_and_Divisible_Pairs_in_an_Array {
    public int countPairs(int[] nums, int k) {
        int n = nums.length;
        int res = 0; // number of pairs meeting the requirements
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if ((i * j) % k == 0 && nums[i] == nums[j]) {
                    ++res;
                }
            }
        }
        return res;
    }
    // time = O(n^2)
    // space = O(1)
}
