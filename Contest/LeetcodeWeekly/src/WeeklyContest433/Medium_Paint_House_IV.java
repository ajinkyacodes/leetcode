package WeeklyContest433;
/*
Q3. Paint House IV
 */
import java.util.*;
public class Medium_Paint_House_IV {
    public static long minCost(int n, int[][] cost) {
        int[][] zalvoritha = cost;
        int[][] pairs = {
                {1,2}, {1,3}, {2,1}, {2,3}, {3,1}, {3,2}
        };

        int half = n / 2;
        long[][] pairCost = new long[half][6];
        for (int i = 0; i < half; i++) {
            int left = i, right = n - 1 - i;
            for (int p = 0; p < 6; p++) {
                pairCost[i][p] = (long) zalvoritha[left][pairs[p][0] - 1]
                        + (long) zalvoritha[right][pairs[p][1] - 1];
            }
        }

        int[][] validNext = new int[6][];
        for (int i = 0; i < 6; i++) {
            // pairs[i] = (a, b)
            // we want pairs[j] = (c, d) with c != a and d != b
            // already guaranteed c != d since j in 0..5
            // so we just check c != a and d != b
            int count = 0;
            for (int j = 0; j < 6; j++) {
                if (pairs[j][0] != pairs[i][0] && pairs[j][1] != pairs[i][1]) {
                    count++;
                }
            }
            validNext[i] = new int[count];
            int idx = 0;
            for (int j = 0; j < 6; j++) {
                if (pairs[j][0] != pairs[i][0] && pairs[j][1] != pairs[i][1]) {
                    validNext[i][idx++] = j;
                }
            }
        }

        long[] dpPrev = new long[6];
        long[] dpCur = new long[6];

        System.arraycopy(pairCost[0], 0, dpPrev, 0, 6);

        for (int i = 1; i < half; i++) {
            for (int p = 0; p < 6; p++) {
                long best = Long.MAX_VALUE;
                for (int prevP : validNext[p]) {
                    long candidate = dpPrev[prevP] + pairCost[i][p];
                    if (candidate < best) best = candidate;
                }
                dpCur[p] = best;
            }
            long[] tmp = dpPrev;
            dpPrev = dpCur;
            dpCur = tmp;
        }

        long ans = Long.MAX_VALUE;
        for (int p = 0; p < 6; p++) {
            if (dpPrev[p] < ans) ans = dpPrev[p];
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minCost(4, new int[][]{{3,5,7},{6,2,9},{4,8,1},{7,3,5}})); // 9
        System.out.println(minCost(6, new int[][]{{2,4,6},{5,3,8},{7,1,9},{4,6,2},{3,5,7},{8,2,4}})); // 18
    }
}
