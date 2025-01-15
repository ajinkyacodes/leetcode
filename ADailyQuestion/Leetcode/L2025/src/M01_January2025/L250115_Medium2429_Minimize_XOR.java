package M01_January2025;
/*
Link: https://leetcode.com/problems/minimize-xor/description/
2429. Minimize XOR
Topics: Greedy, Bit Manipulation
Solution Explained: https://www.youtube.com/watch?v=zSuIRdCuRmw
 */
public class L250115_Medium2429_Minimize_XOR {
    public static int minimizeXor(int num1, int num2) {
        int count = Integer.bitCount(num2);
        int result = 0;

        // Cancel set bits from highest to lowest weight
        for(int i=31; i>=0 && count>0; i--) {
            if((num1 & (1<<i)) != 0) {
                count--;
                result += (1<<i);
            }
        }

        // Set bits lowest to highest weight
        for(int i=0; i<32 && count>0; i++) {
            if((num1 & (1<<i)) ==0) {
                count--;
                result += (1<<i);
            }
        }
        return result;
    }
    // TC = O(log n) => O(1)  (Since int -> 32 bits)
    // SC = O(1)

    public static void main(String[] args) {
        System.out.println(minimizeXor(3,5)); // 5
        System.out.println(minimizeXor(1,12)); // 5
    }
}
