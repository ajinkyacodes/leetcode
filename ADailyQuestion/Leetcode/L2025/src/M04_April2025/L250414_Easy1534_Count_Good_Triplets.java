package M04_April2025;
/*
Link: https://leetcode.com/problems/count-good-triplets/description/
1534. Count Good Triplets
 */
public class L250414_Easy1534_Count_Good_Triplets {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length, cnt = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                for (int k = j + 1; k < n; ++k) {
                    if (
                            Math.abs(arr[i] - arr[j]) <= a &&
                                    Math.abs(arr[j] - arr[k]) <= b &&
                                    Math.abs(arr[i] - arr[k]) <= c
                    ) {
                        ++cnt;
                    }
                }
            }
        }
        return cnt;
    }
    // time = O(n^3)
    // space = O(1)
}
