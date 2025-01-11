package Leetcode75;
/*
Link: https://leetcode.com/problems/reverse-vowels-of-a-string/description/
345. Reverse Vowels of a String
Topics: Two Pointers, String
 */
public class L05_Easy345 {
    // Check if the character is vowel
    public static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
            return true;
        }
        return false;
    }

    public static String reverseVowels(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start<end) {
            if(!isVowel(ch[start])) {
                start++;
            } else if(!isVowel(ch[end])) {
                end--;
            } else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s)); // "AceCreIm"
    }
}
