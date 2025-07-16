package M07_July2025;
/*
Link: https://leetcode.com/problems/find-the-maximum-length-of-valid-subsequence-i/description/
3201. Find the Maximum Length of Valid Subsequence I
 */
public class L250716_Medium3201_Find_the_Maximum_Length_of_Valid_Subsequence_I {
    public int maximumLength(int[] nums) {
        int res = 0;
        int[][] patterns = { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 } };
        for (int[] pattern : patterns) {
            int cnt = 0;
            for (int num : nums) {
                if (num % 2 == pattern[cnt % 2]) {
                    cnt++;
                }
            }
            res = Math.max(res, cnt);
        }
        return res;
    }
    // time = O(n)
    // space = O(1)
}
