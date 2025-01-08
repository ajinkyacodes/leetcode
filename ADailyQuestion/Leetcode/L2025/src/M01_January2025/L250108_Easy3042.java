package M01_January2025;
/*
Link : https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/description/
3042. Count Prefix and Suffix Pairs I
Topics: Array, String, String Matching, Trie, Hash Function
 */
public class L250108_Easy3042 {
    public static boolean isPrefixAndSuffix(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        if(n1 > n2) return false;
        String s2Prefix = str2.substring(0, n1);
        String s2Suffix = str2.substring(n2-n1, n2);
        if(s2Prefix.equals(str1) && s2Suffix.equals(str1)) {
            return true;
        }
        return false;
    }

    public static int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int count = 0;

        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++){
                if(isPrefixAndSuffix(words[i], words[j])){
                    count++;
                }
            }
        }

        return count;
    }
    // TC = O(N^2 * M)
    // SC = O(1)

    public static void main(String[] args) {
        String[] words = {"a","aba","ababa","aa"};
        System.out.println(countPrefixSuffixPairs(words)); // 4
    }
}
