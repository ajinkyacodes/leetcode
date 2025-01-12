package Hard;
/*
Link: https://leetcode.com/problems/trapping-rain-water/description/
42. Trapping Rain Water
Topics: Array, Two Pointers, DP, Stack, Monotonic Stack
 */
public class Hard42 {
    public static int trap(int[] height) {
        int n = height.length;
        int waterTrapped = 0;

        // If array length is less than 3 then there will be no watter trapped
        if(n<=2) return 0;


        // Calculating maximum height towards right and left of array at each index block
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Fill the leftMax from left to right
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        // Fill the rightMax from right to left
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        // Calculating Trapping Water
        for(int i=0; i<n; i++) {
            waterTrapped += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return waterTrapped;
    }
    // TC = O(N)
    // SC = O(N)

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height)); // 6

        int[] height2 = {4,2,0,3,2,5};
        System.out.println(trap(height2)); // 9
    }
}
