package Easy;
/*
Link: https://leetcode.com/problems/is-subsequence/description/
392. Is Subsequence
Topics: Two Pointers, String, Dynamic Programming
 */
public class Easy392_Is_Subsequence {
    public static boolean isSubsequence(String s, String t) {
        int si=0;
        if(s.length()<1) return true;

        for(int i=0;i<t.length();i++){
            if(s.charAt(si)==t.charAt(i)) {
                si++;
            }

            if(si==s.length()) {
                return true;
            }
        }

        return false;
    }
    // TC = O(n)
    // SC = O(1)

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc")); // true;
        System.out.println(isSubsequence("ace", "abcde")); // true;
        System.out.println(isSubsequence("aec", "abcde")); // false;
    }
}
