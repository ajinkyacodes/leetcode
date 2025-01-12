package GFGWeekly189;
/* Topic: Math, BitMap */
public class NumberDifference {
    public static int numDifference(int n) {
        // Binary representation of n
        int numBits = (int)(Math.log(n) / Math.log(2)) +1;

        int allOnesMask = (1<<numBits)-1;

        int invertedNumber = (~n) & allOnesMask;

        return Math.abs(n-invertedNumber);
    }

    public static void main(String[] args) {
        System.out.println(numDifference(5)); // 3
        System.out.println(numDifference(1)); // 1
    }
}
