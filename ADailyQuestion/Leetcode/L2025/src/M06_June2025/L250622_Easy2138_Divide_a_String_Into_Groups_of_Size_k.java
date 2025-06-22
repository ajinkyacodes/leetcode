package M06_June2025;
/*
Link: https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/description/
2138. Divide a String Into Groups of Size k
 */
import java.util.*;
public class L250622_Easy2138_Divide_a_String_Into_Groups_of_Size_k {
    public String[] divideString(String s, int k, char fill) {
        List<String> res = new ArrayList<>(); // grouped string
        int n = s.length();
        int curr = 0; // starting index of each group
        // split string
        while (curr < n) {
            int end = Math.min(curr + k, n);
            res.add(s.substring(curr, end));
            curr += k;
        }
        // try to fill in the last group
        String last = res.get(res.size() - 1);
        if (last.length() < k) {
            last += String.valueOf(fill).repeat(k - last.length());
            res.set(res.size() - 1, last);
        }
        return res.toArray(new String[0]);
    }
    // time = O(max(n,k)).
    // space = O(1).
}
