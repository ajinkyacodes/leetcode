package M06_June2025;
/*
Link: https://leetcode.com/problems/minimum-deletions-to-make-string-k-special/description/
3085. Minimum Deletions to Make String K-Special
 */
import java.util.*;
public class L250621_Medium3085_Minimum_Deletions_to_Make_String_K_Special {
    public int minimumDeletions(String word, int k) {
        Map<Character, Integer> cnt = new HashMap<>();
        for (char ch : word.toCharArray()) {
            cnt.put(ch, cnt.getOrDefault(ch, 0) + 1);
        }
        int res = word.length();
        for (int a : cnt.values()) {
            int deleted = 0;
            for (int b : cnt.values()) {
                if (a > b) {
                    deleted += b;
                } else if (b > a + k) {
                    deleted += b - (a + k);
                }
            }
            res = Math.min(res, deleted);
        }
        return res;
    }
    // time = O(n+C^2).
    // space = O(C).
}
