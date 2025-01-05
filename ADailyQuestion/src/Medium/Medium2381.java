package Medium;
/*
Link : https://leetcode.com/problems/shifting-letters-ii/description/
2381. Shifting Letters II
Topics: Array, String, PrefixSum
Date: 5 January 2025
 */
public class Medium2381 {
    public static String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        char[] ch = s.toCharArray();
        int[] count = new int[n+1];

        for(int[] shift : shifts){
            int value = shift[2] == 1 ? 1 : -1;
            count[shift[0]] += value;
            count[shift[1]+1] -= value;
        }

        int sum = 0;
        for(int i=0; i<n; i++){
            sum += count[i];
            int newChar = ((ch[i] - 'a') + sum) % 26;
            if(newChar < 0) newChar += 26;
            ch[i] = (char)('a' + newChar);
        }
        return String.valueOf(ch);
    }
    // TC = O(N+M)
    // SC = O(N)

    public static void main(String[] args) {
        String s = "abc";
        int[][] shifts = {{0,1,0},{1,2,1},{0,2,1}}; // "ace"
        System.out.println(shiftingLetters(s,shifts));
    }
}
