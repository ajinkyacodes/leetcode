package M06_June2025;
/*
Link: https://leetcode.com/problems/lexicographically-minimum-string-after-removing-stars/description/
3170. Lexicographically Minimum String After Removing Stars
 */
import java.util.*;
public class L250607_Medium3170_Lexicographically_Minimum_String_After_Removing_Stars {
    public String clearStars(String s) {
        Deque<Integer>[] cnt = new Deque[26];
        for (int i = 0; i < 26; i++) {
            cnt[i] = new ArrayDeque<>();
        }
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '*') {
                cnt[arr[i] - 'a'].push(i);
            } else {
                for (int j = 0; j < 26; j++) {
                    if (!cnt[j].isEmpty()) {
                        arr[cnt[j].pop()] = '*';
                        break;
                    }
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char c : arr) {
            if (c != '*') {
                ans.append(c);
            }
        }
        return ans.toString();
    }
    // time = O(n×∣Σ∣).
    // space = O(n+∣Σ∣).
}
