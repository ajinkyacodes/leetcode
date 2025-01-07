package M1_Jan2025;
/*
Link : https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/description/
1769. Minimum Number of Operations to Move All Balls to Each Box
Topics: Array, String, PrefixSum
Solution: https://www.youtube.com/watch?v=zOB9Awj9b_0
FAANG: Amazon
 */
public class L250106_Medium1769 {
    public static int[] minOperations(String boxes) {
        int n = boxes.length();
        int sum = 0;
        int rightOnes = 0;
        int[] result = new int[n];

        // Calculate initial sum and count of 1's to the right
        for(int i=0; i<n; i++) {
            if (boxes.charAt(i) == '1') {
                sum += i;
                rightOnes++;
            }
        }

        // Calculate moves per position
        int prefixSum = 0;
        int leftOnes = 0;

        for(int i=0; i<n; i++) {
            int moves = prefixSum + sum;
            result[i] = moves;

            // Update both sum and prefixSum
            if(boxes.charAt(i)=='1'){
                leftOnes++;
                rightOnes--;
            }

            prefixSum += leftOnes;
            sum -= rightOnes;
        }

        return result;
    }
    // TC = O(N)
    // SC = O(N)

    public static void main(String[] args) {
        String boxes = "110"; // [1,,1,3]
        String boxes2 = "001011"; // [11,8,5,4,3,4]
        int[] output = minOperations(boxes);
        for(int i=0; i<output.length; i++){
            System.out.print(output[i]+" ");
        }
    }
}
