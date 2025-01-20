package Easy;
/*
Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
1295. Find Numbers with Even Number of Digits
 */
public class Easy1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int countDigits(int n) {
        if(n==0) return 1;
        int count = 0;
        while(n!=0) {
            n = n/10;
            count++;
        }
        return count;
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(countDigits(nums[i])%2==0){
                count++;
            }
        }
        return count;
    }
    // TC = O(n*d) Where d => maximum number of digits
    // SC = O(1)

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12,345,2,6,7896})); // 2
        System.out.println(findNumbers(new int[]{555,901,482,1771})); // 1
    }
}
