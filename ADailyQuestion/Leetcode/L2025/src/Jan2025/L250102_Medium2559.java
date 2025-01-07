package Jan2025;
/*
Link : https://leetcode.com/problems/count-vowel-strings-in-ranges/description/
2559. Count Vowel Strings in Ranges
Topics: Array, String, PrefixSum
Solution: https://www.youtube.com/watch?v=-ZiwmH8dtwM
 */
public class L250102_Medium2559 {
    private static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefixSum = new int[n+1];

        // Prefix Sum for count of strings starting and ending with vowel
        for(int i=0; i<n; i++) {
            char start = words[i].charAt(0);
            char end = words[i].charAt(words[i].length()-1);
            if(isVowel(start) && isVowel(end)){
                prefixSum[i+1] = 1 + prefixSum[i];
            } else {
                prefixSum[i+1] = prefixSum[i];
            }
        }

        // Compute each query
        int[] result = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            result[i] = prefixSum[end+1] - prefixSum[start];
        }
        return result;
    }
    // TC = O(N+M)
    // SC = O(N+M)

    public static void main(String[] args) {
        String[] words = {"aba","bcb","ece","aa","e"};
        int[][] queries = {{0,2},{1,4},{1,1}};
        int[] output = vowelStrings(words, queries); // [2,3,0]
        for(int i=0; i<output.length; i++){
            System.out.print(output[i]+" ");
        }
    }
}
