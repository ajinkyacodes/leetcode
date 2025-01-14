package M01_January2025;
/*
Link: https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/description/
2657. Find the Prefix Common Array of Two Arrays
 */
public class L250114_Medium2657 {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];
        int[] freq = new int[n+1];
        int count = 0;
        for(int i=0; i<n; i++) {
            freq[A[i]]++;
            if(freq[A[i]]==2) count++;
            freq[B[i]]++;
            if(freq[B[i]]==2) count++;
            C[i] = count;
        }
        return C;
    }
    // TC = O(N)
    // SC = O(N)

    public static void main(String[] args) {
        int[] A = {1,3,2,4};
        int[] B = {3,1,2,4};
        int[] C = findThePrefixCommonArray(A,B);
        for(int i=0; i<C.length; i++) {
            System.out.print(C[i]+" "); // [0,2,3,4]
        }
    }
}
