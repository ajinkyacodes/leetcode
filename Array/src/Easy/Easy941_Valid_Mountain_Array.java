package Easy;
/*
Link: 941. Valid Mountain Array
https://leetcode.com/problems/valid-mountain-array/description/
Topics: Array, Two Pointers
 */
public class Easy941_Valid_Mountain_Array {
    public static boolean validMountainArray(int[] A) {
        int n = A.length;

        if(n<3) return false;

        int left = 0, right = n-1;

        while(left < n-1){
            if(A[left] < A[left+1]) {
                left++;
            } else {
                break;
            }
        }

        if(left == n-1) return false; // Only strictly increasing => 0 1 2 3 4 5 6 8 9

        while(right > 0) {
            if(A[right] < A[right-1]) {
                right--;
            } else {
                break;
            }
        }

        if(right == 0) return false; // Only strictly decreasing => 9 6 5 3 2 1 0

        return left == right;
    }
    // TC = O(n)
    // SC = O(1)

    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{2,1})); // false
        System.out.println(validMountainArray(new int[]{3,5,5})); // false
        System.out.println(validMountainArray(new int[]{0,3,2,1})); // true
        System.out.println(validMountainArray(new int[]{0,2,3,4,5,2,1,0})); // true
        System.out.println(validMountainArray(new int[]{2,0,2})); // false
        System.out.println(validMountainArray(new int[]{1,7,9,5,4,1,2})); // false
    }
}
