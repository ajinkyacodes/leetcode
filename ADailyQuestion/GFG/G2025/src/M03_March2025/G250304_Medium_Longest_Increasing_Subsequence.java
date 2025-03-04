package M03_March2025;

import java.util.ArrayList;
import java.util.Collections;

/*
Link: https://www.geeksforgeeks.org/problems/longest-increasing-subsequence-1587115620/1
Longest Increasing Subsequence
 */
public class G250304_Medium_Longest_Increasing_Subsequence {
    public int lis(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int num : arr) {
            int idx = Collections.binarySearch(ans, num);
            if (idx < 0) idx = -idx - 1;
            if (idx == ans.size()) ans.add(num);
            else ans.set(idx, num);
        }
        return ans.size();
    }
}
