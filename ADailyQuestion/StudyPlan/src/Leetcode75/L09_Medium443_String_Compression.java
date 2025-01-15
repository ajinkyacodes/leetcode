package Leetcode75;
/*
Link: https://leetcode.com/problems/string-compression/description/
443. String Compression
 */

public class L09_Medium443_String_Compression {
    public static int compress(char[] chars) {
        int index = 0; // Position to write in the original array

        // Iterate through the input array
        for (int i = 0; i < chars.length; i++) {
            int j = i;

            // Find the end of the current group of consecutive characters
            while (j < chars.length && chars[j] == chars[i]) {
                j++;
            }

            // Write the character
            chars[index++] = chars[i];
            int groupLength = j - i; // Length of the current group

            // If the group length is greater than 1, write the digits
            if (groupLength > 1) {
                for (char c : String.valueOf(groupLength).toCharArray()) {
                    chars[index++] = c;
                }
            }

            // Move to the next group
            i = j - 1;
        }

        //System.out.println(Arrays.toString(chars));

        return index;
    }
    // TC = O(n)
    // SC = O(1)

    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'})); // Return 6, ["a","2","b","2","c","3"]
        System.out.println(compress(new char[]{'a'})); // Return 1, ["a"]
        System.out.println(compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'})); // Return 4, ["a","b","1","2"]
    }
}
