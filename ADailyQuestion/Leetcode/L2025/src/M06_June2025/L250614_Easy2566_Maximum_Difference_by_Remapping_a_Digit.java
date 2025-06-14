package M06_June2025;
/*
Link: https://leetcode.com/problems/maximum-difference-by-remapping-a-digit/description/
2566. Maximum Difference by Remapping a Digit
 */
public class L250614_Easy2566_Maximum_Difference_by_Remapping_a_Digit {
    public int minMaxDifference(int num) {
        String s = Integer.toString(num);
        String t = s;
        int pos = 0;
        while (pos < s.length() && s.charAt(pos) == '9') {
            pos++;
        }
        if (pos < s.length()) {
            s = s.replace(s.charAt(pos), '9');
        }
        t = t.replace(t.charAt(0), '0');
        return Integer.parseInt(s) - Integer.parseInt(t);
    }
    // time = O(lognum).
    // space = O(lognum).
}
