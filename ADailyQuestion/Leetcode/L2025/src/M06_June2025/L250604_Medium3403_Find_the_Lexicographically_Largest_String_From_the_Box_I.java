package M06_June2025;
/*
Link: https://leetcode.com/problems/find-the-lexicographically-largest-string-from-the-box-i/description/
3403. Find the Lexicographically Largest String From the Box I
 */
public class L250604_Medium3403_Find_the_Lexicographically_Largest_String_From_the_Box_I {
    // Approach : Two Pointers
    public String lastSubstring(String s) {
        int i = 0, j = 1, n = s.length();
        while (j < n) {
            int k = 0;
            while (j + k < n && s.charAt(i + k) == s.charAt(j + k)) {
                k++;
            }
            if (j + k < n && s.charAt(i + k) < s.charAt(j + k)) {
                int t = i;
                i = j;
                j = Math.max(j + 1, t + k + 1);
            } else {
                j = j + k + 1;
            }
        }
        return s.substring(i);
    }

    public String answerString(String word, int numFriends) {
        if (numFriends == 1) {
            return word;
        }
        String last = lastSubstring(word);
        int n = word.length(), m = last.length();
        return last.substring(0, Math.min(m, n - numFriends + 1));
    }
    // time = O(n)
    // space = O(n)
}
