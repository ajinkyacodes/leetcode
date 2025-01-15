package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1
Trapping Rain Water
Topics: Arrays, DP, Stack, Two Pointers
 */
public class G250112_Hard_Trapping_Rain_Water {
    public static int maxWater(int arr[]) {
        int n = arr.length;
        int waterTrapped = 0;

        // If there are less than 3 blocks, no water can be trapped
        if(n<=2) return 0;

        // Arrays to store maximum and minimum heights to the left and right of each block
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Fill the leftMax array
        leftMax[0] = arr[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }

        // Fill the rightMax array
        rightMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }

        // Calculate Total Water Trapped
        for(int i=0; i<n; i++) {
            waterTrapped += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }

        return waterTrapped;
    }
    // TC = O(N)
    // SC = O(N)

    public static void main(String[] args) {
        int[] arr1 = {3, 0, 1, 0, 4, 0, 2};
        System.out.println(maxWater(arr1)); // Output: 10

        int[] arr2 = {3, 0, 2, 0, 4};
        System.out.println(maxWater(arr2)); // Output: 7

        int[] arr3 = {1, 2, 3, 4};
        System.out.println(maxWater(arr3)); // Output: 0

        int[] arr4 = {2, 1, 5, 3, 1, 0, 4};
        System.out.println(maxWater(arr4)); // Output: 9
    }
}
