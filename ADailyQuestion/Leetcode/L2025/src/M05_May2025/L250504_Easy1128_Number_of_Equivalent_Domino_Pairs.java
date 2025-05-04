package M05_May2025;
/*
Link: https://leetcode.com/problems/number-of-equivalent-domino-pairs/description/
1128. Number of Equivalent Domino Pairs
 */
public class L250504_Easy1128_Number_of_Equivalent_Domino_Pairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] num = new int[100];
        int ret = 0;
        for (int[] domino : dominoes) {
            int val = domino[0] < domino[1]
                    ? domino[0] * 10 + domino[1]
                    : domino[1] * 10 + domino[0];
            ret += num[val];
            num[val]++;
        }
        return ret;
    }
    // time = O(n)
    // space = O(1)
}
