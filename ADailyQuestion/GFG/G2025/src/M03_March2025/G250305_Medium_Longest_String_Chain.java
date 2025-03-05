package M03_March2025;
/*
Link: https://www.geeksforgeeks.org/problems/longest-string-chain/1
Longest String Chain
 */
import java.util.*;
public class G250305_Medium_Longest_String_Chain {
    public int longestStringChain(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        Map<String, Integer> dp = new HashMap<>();
        int res = 1;
        for (String w : words) {
            dp.put(w, 1);
            for (int i = 0; i < w.length(); i++) {
                String pred = w.substring(0, i) + w.substring(i + 1);
                dp.put(w, Math.max(dp.get(w), dp.getOrDefault(pred, 0) + 1));
            }
            res = Math.max(res, dp.get(w));
        }
        return res;
    }
    // time = O(n)
    // space = O(n)
}
