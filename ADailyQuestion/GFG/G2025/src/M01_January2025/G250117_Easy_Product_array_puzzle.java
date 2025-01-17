package M01_January2025;

import java.util.Arrays;

/*
Link: https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1
Product array puzzle
Topics: Prefix Sum
 */
public class G250117_Easy_Product_array_puzzle {
    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;
        int[] answer = new int[n];

        int prefix = 1;
        for(int i=0; i<n; i++) {
            answer[i] = prefix;
            prefix *= arr[i];
        }

        int suffix = 1;
        for(int i=n-1; i>=0; i--) {
            answer[i] *= suffix;
            suffix *= arr[i];
        }
        return answer;
    }
    // TC = O(n)
    // SC = O(1)

    public static void main(String[] args) {
        int[] answer1 = productExceptSelf(new int[]{10, 3, 5, 6, 2});
        int[] answer2 = productExceptSelf(new int[]{12, 0});
        System.out.println(Arrays.toString(answer1)); // [180, 600, 360, 300, 900]
        System.out.println(Arrays.toString(answer2)); // [0, 12]
    }
}
