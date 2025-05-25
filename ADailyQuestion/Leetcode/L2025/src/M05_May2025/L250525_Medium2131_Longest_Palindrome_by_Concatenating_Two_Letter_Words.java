package M05_May2025;
/*
Link: https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words/description/
2131. Longest Palindrome by Concatenating Two Letter Words
 */
import java.util.*;
public class L250525_Medium2131_Longest_Palindrome_by_Concatenating_Two_Letter_Words {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> count = new HashMap<String, Integer>();
        for (String word : words) {
            Integer countOfTheWord = count.get(word);
            if (countOfTheWord == null) {
                count.put(word, 1);
            } else {
                count.put(word, countOfTheWord + 1);
            }
        }
        int answer = 0;
        boolean central = false;
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            String word = entry.getKey();
            int countOfTheWord = entry.getValue();
            // if the word is a palindrome
            if (word.charAt(0) == word.charAt(1)) {
                if (countOfTheWord % 2 == 0) {
                    answer += countOfTheWord;
                } else {
                    answer += countOfTheWord - 1;
                    central = true;
                }
                // consider a pair of non-palindrome words such that one is the reverse of another
            } else if (word.charAt(0) < word.charAt(1)) {
                String reversedWord = "" + word.charAt(1) + word.charAt(0);
                if (count.containsKey(reversedWord)) {
                    answer += 2 * Math.min(countOfTheWord, count.get(reversedWord));
                }
            }
        }
        if (central) {
            answer++;
        }
        return 2 * answer;
    }
    // time = O(N+min(N,∣Σ∣^2)).
    // space = O(min(N,∣Σ∣^2)).
}
