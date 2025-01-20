package Easy;

import java.util.Arrays;

/*
Link: https://leetcode.com/problems/duplicate-zeros/description/
1089. Duplicate Zeros
 */
public class Easy1089_Duplicate_Zeros {
    public static void duplicateZeros(int[] arr) {
        int n = arr.length, count = 0;

        for (int num : arr) if (num == 0) count++;
        int i = n - 1;
        int write = n + count - 1;

        while (i >= 0 && write >= 0)  {

            if (arr[i] != 0) { // Non-zero, just write it in
                if (write < n) arr[write] = arr[i];

            } else { // Zero found, write it in twice if we carrn
                if (write < n) arr[write] = arr[i];
                write--;
                if (write < n) arr[write] = arr[i];
            }

            i--;
            write--;
        }
        System.out.println(Arrays.toString(arr));
    }
    // TC = O(n)
    // SC = O(1)

    public static void main(String[] args) {
        duplicateZeros(new int[]{1,0,2,3,0,4,5,0}); // [1,0,0,2,3,0,0,4]
        duplicateZeros(new int[]{1,2,3}); // [1,2,3]
    }
}
