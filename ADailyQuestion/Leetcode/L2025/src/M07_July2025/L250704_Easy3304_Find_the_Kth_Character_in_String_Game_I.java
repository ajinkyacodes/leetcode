package M07_July2025;
/*
Link: https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/description/
3304. Find the K-th Character in String Game I
 */
public class L250704_Easy3304_Find_the_Kth_Character_in_String_Game_I {
    public char kthCharacter(int k) {
        int ans = 0;
        int t;
        while (k != 1) {
            t = 31 - Integer.numberOfLeadingZeros(k);
            if ((1 << t) == k) {
                t--;
            }
            k = k - (1 << t);
            ans++;
        }
        return (char) ('a' + ans);
    }
    // time = O(logk).
    // space = O(1).
}
