package M05_May2025;
/*
Link: https://leetcode.com/problems/find-words-containing-character/description/
2942. Find Words Containing Character
 */
import java.util.*;
public class L250524_Easy2942_Find_Words_Containing_Character {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            if (words[i].indexOf(x) != -1) {
                res.add(i);
            }
        }
        return res;
    }
    // time = O(n∗m)
    // space = O(1)
}
