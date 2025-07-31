package M07_July2025;
/*
Link: https://leetcode.com/problems/bitwise-ors-of-subarrays/description/
898. Bitwise ORs of Subarrays
 */
import java.util.*;
public class L250731_Medium898_Bitwise_ORs_of_Subarrays {
    public int subarrayBitwiseORs(int[] A) {
        Set<Integer> ans = new HashSet();
        Set<Integer> cur = new HashSet();
        cur.add(0);
        for (int x: A) {
            Set<Integer> cur2 = new HashSet();
            for (int y: cur)
                cur2.add(x | y);
            cur2.add(x);
            cur = cur2;
            ans.addAll(cur);
        }

        return ans.size();
    }
    // time = O(NlogW)
    // space = O(NlogW)
}
