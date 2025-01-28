package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1
Permutations of a String
Topic: String, Recursion, Backtracking
 */
import java.util.*;
public class L250128_Medium_Permutations_of_a_String {
    public static ArrayList<String> findPermutation(String s) {
        ArrayList<String> res = new ArrayList<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        do res.add(new String(chars));
        while (next(chars));
        return res;
    }

    private static boolean next(char[] c) {
        int i = c.length - 2, j = c.length - 1;
        while (i >= 0 && c[i] >= c[i + 1]) i--;
        if (i < 0) return false;
        while (c[j] <= c[i]) j--;
        char t = c[i]; c[i] = c[j]; c[j] = t;
        for (int l = i + 1, r = c.length - 1; l < r; l++, r--) {
            t = c[l]; c[l] = c[r]; c[r] = t;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(findPermutation("ABC")); // ["ABC", "ACB", "BAC", "BCA", "CAB", "CBA"]

        System.out.println(findPermutation("ABSG"));
        /*
        ["ABGS", "ABSG", "AGBS", "AGSB", "ASBG", "ASGB", "BAGS", "BASG", "BGAS", "BGSA",
        "BSAG", "BSGA", "GABS", "GASB", "GBAS", "GBSA", "GSAB", "GSBA",
        "SABG", "SAGB", "SBAG", "SBGA", "SGAB", "SGBA"]
         */

        System.out.println(findPermutation("AAA")); // ["AAA"]
    }
}
