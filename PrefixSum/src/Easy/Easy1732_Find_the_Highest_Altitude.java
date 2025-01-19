package Easy;
/*
Link: https://leetcode.com/problems/find-the-highest-altitude/description/
1732. Find the Highest Altitude
Topic: Prefix Sum
 */
public class Easy1732_Find_the_Highest_Altitude {
    public static int largestAltitude(int[] gain) {
        int n = gain.length;
        int maxHeight = 0;
        int[] alt = new int[n+1];
        alt[0] = 0;

        // Storing altitudes
        for(int i=1; i<n+1; i++){
            alt[i] = alt[i-1] + gain[i-1];
        }

        // Finding the highest altitude
        for(int i=0; i<alt.length; i++){
            maxHeight = Math.max(maxHeight, alt[i]);
        }

        return maxHeight;
    }
    // TC = O(n)
    // SC = O(n)

    public static void main(String[] args) {
        int[] gain1 = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain1)); // 1

        int[] gain2 = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain2)); // 0
    }
}
