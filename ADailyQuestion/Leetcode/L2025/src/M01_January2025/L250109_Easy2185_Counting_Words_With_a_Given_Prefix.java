package M01_January2025;
/*
Link : https://leetcode.com/problems/counting-words-with-a-given-prefix/description/
2185. Counting Words With a Given Prefix
Topics: Array, String, String Matching
 */
public class L250109_Easy2185_Counting_Words_With_a_Given_Prefix {
    public static int prefixCount(String[] words, String pref) {
        int n = words.length;
        int count = 0;
        for(int i=0; i<n; i++) {
            if(words[i].startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
    // TC = O(N * M)
    // SC = O(1)

    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        String[] words2 = {"leetcode","win","loops","success"};
        String pref2 = "code";
        System.out.println(prefixCount(words, pref)); // 2
        System.out.println(prefixCount(words2, pref2)); // 0
    }
}
