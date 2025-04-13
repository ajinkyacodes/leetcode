package M04_April2025;
/*
Link: https://leetcode.com/problems/count-symmetric-integers/description/
2843. Count Symmetric Integers
 */
public class L250411_Easy2843_Count_Symmetric_Integers {
    public int countSymmetricIntegers(int low, int high) {
        int res = 0;
        for (int a = low; a <= high; ++a) {
            if (a < 100 && a % 11 == 0) {
                res++;
            } else if (1000 <= a && a < 10000) {
                int left = a / 1000 + (a % 1000) / 100;
                int right = (a % 100) / 10 + (a % 10);
                if (left == right) {
                    res++;
                }
            }
        }
        return res;
    }
    // time = O(high−low)
    // space = O(1)
}
