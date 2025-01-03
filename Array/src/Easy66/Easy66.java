package Easy66;
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

    public static int[] practiceMode(int[] digits) {
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

    public static void main(String[] args) {
        int[] digits = {1,0};
        int[] result = practiceMode(digits);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int[] notWorked(int[] digits){
        int n = digits.length;
        int sum = 0;
        int[] result = new int[2];
        if(digits.length == 1){
            if(digits[0]<9){
                digits[0] = digits[0]+1;
                return digits;
            }
            sum = digits[0]+1;
            result[0]=sum/10;
            result[1]=sum%10;
            return result;
        }
        for(int i=0; i<digits.length; i++){
            if(i==digits.length-1){
                digits[i]++;
            }
        }
        System.out.println("Sum = "+sum);
        return digits;
    }
}
