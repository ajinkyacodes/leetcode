package Array;
/*
Link: https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3257/
 */
import java.util.Arrays;
public class InPlaceArray_SC_N {
    public static int[] squareEven(int[] array) {
        int length = array.length;

        // Check for edge cases.
        if (array == null) {
            return null;
        }

        // Create a resultant Array which would hold the result.
        int result[] = new int[length];

        // Iterate through the original Array.
        for (int i = 0; i < length; i++) {

            // Get the element from slot i of the input Array.
            int element = array[i];

            // If the index is an even number, then we need to square element.
            if (i % 2 == 0) {
                element *= element;
            }

            // Write element into the result Array.
            result[i] = element;
        }

        // Return the result Array.
        return result;
    }
    // Time Complexity = O(n)
    // Space Complexity = O(n)

    public static void main(String[] args) {
        int[] array = {9, -2, -9, 11, 56, -12, -3};
        int [] result = squareEven(array);
        System.out.println(Arrays.toString(result)); // [81, -2, 81, 11, 3136, -12, 9]
    }

}
