package M07_July2025;
/*
Link: https://leetcode.com/problems/find-the-k-th-character-in-string-game-ii/description/
3307. Find the K-th Character in String Game II
 */
public class L250704_Hard3307_Find_the_Kth_Character_in_String_Game_II {
    public char kthCharacter(long k, int[] operations) {
        int ans = 0;
        int t;
        while (k != 1) {
            t = 63 - Long.numberOfLeadingZeros(k);
            if ((1L << t) == k) {
                t--;
            }
            k = k - (1L << t);
            if (operations[t] != 0) {
                ans++;
            }
        }
        return (char) ('a' + (ans % 26));
    }
    // time = O(logk).
    // space = O(1).
}
