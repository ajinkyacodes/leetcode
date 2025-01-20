package Array;
/*
Link: https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3294/
 */
public class WritingReadingArrayItems {
    public static void main(String[] args) {
        int[] squareNumbers = new int[10];

        // Go through each of the Array indexes, from 0 to 9.
        for (int i = 0; i < 10; i++) {
            // We need to be careful with the 0-indexing. The next square number
            // is given by (i + 1) * (i + 1).
            // Calculate it and insert it into the Array at index i.
            int square = (i + 1) * (i + 1);
            squareNumbers[i] = square;
        }

        // Go through each of the Array indexes, from 0 to 9.
        for (int i = 0; i < 10; i++) {
            // Access and print what's at the i'th index.
            System.out.println(squareNumbers[i]);
        }

        // Will print:
        // 1
        // 4
        // 9
        // 16
        // 25
        // 36
        // 49
        // 64
        // 81
        // 100

        System.out.println("-------------------------");

        // For each VALUE in the Array.
        // We can use it whenever we don't need the index values.
        for (int square : squareNumbers) {
            // Print the current value of square.
            System.out.println(square);
        }
        // Prints exactly the same as the previous example.

    }
}
