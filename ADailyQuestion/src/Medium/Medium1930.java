package Medium;
/*
Link : https://leetcode.com/problems/unique-length-3-palindromic-subsequences/description/
1930. Unique Length-3 Palindromic Subsequences
Date: 4 January 2025
 */
public class Medium1930 {
    public static int countPalindromicSubsequence(String s) {
        String str = "ABC"+s;
        int output = str.length();
        return output;
    }

    public static void main(String[] args) {
        String a = "XYZ";
        System.out.println(countPalindromicSubsequence(a));
    }
}
