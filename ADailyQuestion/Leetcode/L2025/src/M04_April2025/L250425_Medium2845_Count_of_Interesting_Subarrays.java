package M04_April2025;
/*
Link: https://leetcode.com/problems/count-of-interesting-subarrays/description/
2845. Count of Interesting Subarrays
 */
import java.util.*;
public class L250425_Medium2845_Count_of_Interesting_Subarrays {
    public long countInterestingSubarrays(
            List<Integer> nums,
            int modulo,
            int k
    ) {
        int n = nums.size();
        HashMap<Integer, Integer> cnt = new HashMap<>();
        long res = 0;
        int prefix = 0;
        cnt.put(0, 1);
        for (int i = 0; i < n; i++) {
            prefix += nums.get(i) % modulo == k ? 1 : 0;
            res += cnt.getOrDefault((prefix - k + modulo) % modulo, 0);
            cnt.put(prefix % modulo, cnt.getOrDefault(prefix % modulo, 0) + 1);
        }
        return res;
    }
    // time = O(n)
    // space = O(min(n,modulo))
}
