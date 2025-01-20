package Array;
/*
Link: https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3257/
 */
import java.util.Arrays;
public class InPlaceArray_SC_1 {
    public static int[] squareEven(int[] array) {
        int length = array.length;

        // Check for edge cases.
        if (array == null) {
            return array;
        }

        // Iterate through even elements of the original array.
        // Notice how we don't need to do *anything* for the odd indexes? :-)
        for (int i = 0; i < length; i += 2) {

            // Index is an even number, so we need to square the element
            // and replace the original value in the Array.
            array[i] *= array[i];

        }

        // We just return the original array. Some problems on leetcode require you
        // to return it, and other's don`t.
        return array;
    }
    // Time Complexity = O(n)
    // Space Complexity = O(1)

    public static void main(String[] args) {
        int[] array = {9, -2, -9, 11, 56, -12, -3};
        int [] result = squareEven(array);
        System.out.println(Arrays.toString(result)); // [81, -2, 81, 11, 3136, -12, 9]
    }
}
