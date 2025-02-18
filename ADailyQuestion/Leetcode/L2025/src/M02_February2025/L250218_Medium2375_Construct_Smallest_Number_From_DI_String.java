package M02_February2025;
/*
Link: https://leetcode.com/problems/construct-smallest-number-from-di-string/description/
2375. Construct Smallest Number From DI String
 */
import java.util.*;
public class L250218_Medium2375_Construct_Smallest_Number_From_DI_String {
    // Using Stack
    public String smallestNumber(String pattern) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> numStack = new Stack<>();

        // Iterate through the pattern
        for (int index = 0; index <= pattern.length(); index++) {
            // Push the next number onto the stack
            numStack.push(index + 1);

            // If 'I' is encountered or we reach the end, pop all stack elements
            if (index == pattern.length() || pattern.charAt(index) == 'I') {
                while (!numStack.isEmpty()) {
                    result.append(numStack.pop());
                }
            }
        }

        return result.toString();
    }
    // time = O(n)
    // space = O(n)
}
