package Leetcode75;
/*
Link: https://leetcode.com/problems/greatest-common-divisor-of-strings/description/
1071. Greatest Common Divisor of Strings
 */
public class L02_Easy1071_Greatest_Common_Divisor_of_Strings {
    // Calculating GCD
    public static int gcd(int a, int b) {
        while(b%a !=0) {
            int rem = b%a;
            b = a;
            a = rem;
        }
        return a;
    }

    public static String gcdOfStrings(String str1, String str2) {
        if((str1+str2).equals(str2+str1)){
            int a = str1.length();
            int b = str2.length();
            int gcd = gcd(a,b);
            return str1.substring(0, gcd);
        } else {
            return "";
        }
    }
    // TC = O(N + M)
    // SC = O(N + M)

    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1, str2)); // "ABC"
    }
}
