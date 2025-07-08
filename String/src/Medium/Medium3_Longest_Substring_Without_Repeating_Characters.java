package Medium;
/*
Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
3. Longest Substring Without Repeating Characters
 */
import java.util.*;
public class Medium3_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> chars = new HashMap();

        int left = 0;
        int right = 0;

        int res = 0;
        while(right<s.length()){
            char r = s.charAt(right);
            chars.put(r,chars.getOrDefault(r,0)+1);

            while(chars.get(r)>1){
                char l = s.charAt(left);
                chars.put(l, chars.get(l)-1);
                left++;
            }

            res = Math.max(res, right - left + 1);

            right++;
        }
        return res;
    }
    // time = O(n)
    // space = O(min(m,n))
}
