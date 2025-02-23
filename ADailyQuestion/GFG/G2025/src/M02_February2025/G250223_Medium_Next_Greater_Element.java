package M02_February2025;

import java.util.ArrayList;
import java.util.Stack;

/*
Link: https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1
Next Greater Element
 */
public class G250223_Medium_Next_Greater_Element {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i];
            while (!s.isEmpty() && s.peek() <= val) s.pop();
            arr[i] = s.isEmpty() ? -1 : s.peek();
            s.push(val);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int num : arr) res.add(num);
        return res;
    }
}
