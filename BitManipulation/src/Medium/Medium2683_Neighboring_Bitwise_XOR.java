package Medium;
/*
Link: https://leetcode.com/problems/neighboring-bitwise-xor/description/
2683. Neighboring Bitwise XOR
Topic: Bit Manipulation
Solution Explained: https://youtu.be/mTx9vHK966s 
 */
public class Medium2683_Neighboring_Bitwise_XOR {
    public static boolean doesValidArrayExist(int[] derived) {
        int res = 0;
        for (int ele : derived) {
            res ^= ele;
        }
        return res == 0;
    }
    // TC = O(n)
    // SC = O(1)

    public static void main(String[] args) {
        System.out.println(doesValidArrayExist(new int[]{1,1,0})); // true
        System.out.println(doesValidArrayExist(new int[]{1,1})); // true
        System.out.println(doesValidArrayExist(new int[]{1,0})); // false
    }
}
