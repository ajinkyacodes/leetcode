package M01_January2025;
/*
Link: https://leetcode.com/problems/check-if-a-parentheses-string-can-be-valid/description/
2116. Check if a Parentheses String Can Be Valid
Topics: String, Stack, Greedy
 */
public class L250112_Medium2116 {
    public static boolean canBeValid(String s, String locked) {
        int n = s.length();
        // If length of the string is odd, it's impossible to make it valid
        if(n%2 != 0) {
            return false;
        }

        int openCount = 0;
        int balance = 0;

        // Pass 1: Check if we can balance from left to right
        for(int i=0; i<n; i++) {
            if(locked.charAt(i)=='1') {
                if(s.charAt(i) == '(') {
                    openCount++;
                } else { // s.charAt(i) == ')'
                    if(openCount > 0) {
                        openCount--;
                    } else {
                        return false; // Unbalanced ')'
                    }
                }
            } else {
                openCount++;
            }
            balance++;
            if(balance < 0) {
                return false;
            }
        }

        openCount = 0;
        balance = 0;

        // Phase 2: Check if we can balance from right to left
        for(int i=n-1; i>=0; i--) {
            if(locked.charAt(i)=='1') {
                if(s.charAt(i) == ')') {
                    openCount++;
                } else { // s.charAt(i) == '('
                    if(openCount>0) {
                        openCount--;
                    } else {
                        return false; // Unbalanced '('
                    }
                }
            } else {
                openCount++;
            }
            balance++;
            if(balance<0) {
                return false;
            }
        }
        return true;
    }
    // TC = O(N)
    // SC = O(1)

    public static void main(String[] args) {
        String s = "))()))", locked = "010100";
        System.out.println(canBeValid(s, locked)); // true
        System.out.println(canBeValid("()()", "0000")); // true
        System.out.println(canBeValid(")", "0")); // false
    }
}
