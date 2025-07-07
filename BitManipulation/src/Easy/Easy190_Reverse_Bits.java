package Easy;
/*
Link: https://leetcode.com/problems/reverse-bits/description/
190. Reverse Bits
 */
public class Easy190_Reverse_Bits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for(int i=0; i<32; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }
        return result;
    }
    // time = O(1)
    // space = O(1)
}
