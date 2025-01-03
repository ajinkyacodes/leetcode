package Easy;
/*
Link: https://leetcode.com/problems/plus-one/description/
#66 - Plus One
*/
public class Easy66 {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
    // TC = O(N)
    // SC = O(N)

    public static void main(String[] args) {
        int[] digits = {1,0};
        int[] result = plusOne(digits);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
