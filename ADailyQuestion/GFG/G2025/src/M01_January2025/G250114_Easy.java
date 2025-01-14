package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1
Equilibrium Point
Topics: Prefix Sum
 */
import java.util.*;
public class G250114_Easy {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        int n = arr.length;
        int i = 0;

        // Calculating lSum
        int[] lSum = new int[n];
        lSum[i] = arr[0];
        for(i=1; i<n; i++) {
            lSum[i] = lSum[i-1]+arr[i];
        }

        // Calculating rSum
        int[] rSum = new int[n];
        rSum[n-1] = arr[n-1];
        for(i=n-2; i>=0; i--) {
            rSum[i] = rSum[i+1]+arr[i];
        }

        //System.out.println(Arrays.toString(lSum));
        //System.out.println(Arrays.toString(rSum));

        // Checking equilibrium point with repeated lSum and rSum
        for(i=0; i<n; i++) {
            if(lSum[i] == rSum[i]) {
                return i;
            }
        }
        return -1;
    }
    // TC = O(n)
    // SC = O(n)

    public static void main(String[] args) {
        System.out.println(findEquilibrium(new int[]{1, 2, 0, 3})); // 2
        System.out.println(findEquilibrium(new int[]{1, 1, 1, 1})); // -1
        System.out.println(findEquilibrium(new int[]{-7, 1, 5, 2, -4, 3, 0})); // 3
        System.out.println(findEquilibrium(new int[]{8, 8, 3, 7, 8, 2, 7, 2})); // 3
    }
}
