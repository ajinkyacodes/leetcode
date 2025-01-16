package Medium;
/*
Link: https://leetcode.com/problems/bitwise-xor-of-all-pairings/description/
2425. Bitwise XOR of All Pairings
Topics: Bit Manipulation, Array
Solution Explained: https://youtu.be/AarEiSvQ6c8
 */
public class Medium2425_Bitwise_XOR_of_All_Pairings {
    public static int xorAllNums(int[] nums1, int[] nums2) {
        int ans = 0;

        // Find contribution by first array elements
        int m = nums2.length;
        if ((m & 1) == 1) {
            for (int ele : nums1) {
                ans ^= ele;
            }
        }

        // Find contribution by second array elements
        int n = nums1.length;
        if ((n & 1) == 1) {
            for (int ele : nums2) {
                ans ^= ele;
            }
        }
        return ans;
    }
    // TC = O(m+n)
    // SC = O(1)

    public static void main(String[] args) {
        System.out.println(xorAllNums(new int[]{2,1,3}, new int[]{10,2,5,0})); // 13
        System.out.println(xorAllNums(new int[]{1,2}, new int[]{3,4})); // 0
    }
}
