package Easy;
/*
Link: https://leetcode.com/problems/merge-strings-alternately/description/
*/
public class Easy1768 {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int n1 = word1.length(), n2 = word2.length();
        int i = 0 , j = 0;

        // Add characters alternatively
        while(i<n1 && j<n2) {
            merged.append(word1.charAt(i++));
            merged.append(word2.charAt(j++));
        }

        // Append remaining chars from word1, if any
        if(i<n1) {
            merged.append(word1.substring(i++));
        }

        // Append remaining chars from word2, if any
        if(j<n2) {
            merged.append(word2.substring(j++));
        }

        return merged.toString();
    }
    // TC = O(N+M)
    // SC = O(N+M)

    public static void main(String[] args) {
        String word1 = "ab", word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2)); // "apbqcr"
    }
}
