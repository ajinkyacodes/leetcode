package M07_July2025;
/*
Link: https://leetcode.com/problems/find-the-original-typed-string-i/description/
3330. Find the Original Typed String I
 */
public class L250701_Easy3330_Find_the_Original_Typed_String_I {
    public int possibleStringCount(String word) {
        int n = word.length(), ans = 1;
        for(int i=1; i<n; i++){
            if(word.charAt(i-1) == word.charAt(i)){
                ans++;
            }
        }
        return ans;
    }
    // time = O(N)
    // space = O(1)
}
