package M01_January2025;
/*
Link : https://leetcode.com/problems/word-subsets/description/
916. Word Subsets
Topics: Array, Hash Table, String
 */
import java.util.ArrayList;
import java.util.List;
public class L250110_Medium916_Word_Subsets {

    // Checking word2 is a subset of word1
    public static boolean checkSubset(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq2[i] > freq1[i]) {
                return false;
            }
        }
        return true;
    }

    public static List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreq = new int[26];

        // Compute maximum frequency required for each character in words2
        for (String word : words2) {
            int[] freq = new int[26];
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }

        List<String> result = new ArrayList<>();

        // Check each word in words1
        for (String word : words1) {
            int[] freq1 = new int[26];
            for (char c : word.toCharArray()) {
                freq1[c - 'a']++;
            }

            boolean isUniversal = true;
            for (int i = 0; i < 26; i++) {
                if (freq1[i] < maxFreq[i]) {
                    isUniversal = false;
                    break;
                }
            }

            if (isUniversal) {
                result.add(word);
            }
        }

        return result;
    }
    // TC = O(O(N + M))
    // SC = O(1)

    public static void main(String[] args) {
        String[] words1 = {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"e","o"};
        List<String> result = wordSubsets(words1, words2);
        for(int i=0; i<result.size(); i++) {
            System.out.print(result.get(i)+" "); // ["facebook","google","leetcode"]
        }
    }
}
