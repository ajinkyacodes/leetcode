package Medium;
/*
Link: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/
1456. Maximum Number of Vowels in a Substring of Given Length
Topics: String, Sliding Window
Solution Explained: https://youtu.be/FEXJGn19u7Y
 */
import java.util.HashSet;

public class Medium1456_Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {
    public static int maxVowels(String s, int k) {
        int maxVowels = 0;
        int windowVowels = 0;

        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        // Count the number of vowels in the first window
        for(int i=0; i<k; i++) {
            if(vowels.contains(s.charAt(i))) {
                windowVowels++;
            }
        }
        maxVowels = windowVowels;

        // Slide the window and update the maximum number of vowels
        for(int i=k; i<s.length(); i++) {
            // removing left element if vowel
            if(vowels.contains(s.charAt(i - k))) {
                windowVowels--;
            }

            // removing right element if vowel
            if(vowels.contains(s.charAt(i))) {
                windowVowels++;
            }

            maxVowels = Math.max(maxVowels, windowVowels);
        }
        return maxVowels;
    }
    // TC = O(n)
    // SC = O(1)

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3)); // 3
        System.out.println(maxVowels("aeiou", 2)); // 2
        System.out.println(maxVowels("leetcode", 3)); // 2
    }
}
