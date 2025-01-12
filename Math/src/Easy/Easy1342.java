package Easy;
/*
Link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
1342. Number of Steps to Reduce a Number to Zero
Topic: Math, Bit Manipulation
 */
public class Easy1342 {
    public static int numberOfSteps(int num) {
        int count = 0;
        while(num>0) {
            if(num%2 == 0) {
                num = num / 2;
            } else {
                num = num-1;
            }
            count++;
        }
        return count;
    }
    // TC = O(Log N)
    // SC = O(1)

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14)); // 6
        System.out.println(numberOfSteps(8)); // 4
        System.out.println(numberOfSteps(123)); // 12
    }
}
