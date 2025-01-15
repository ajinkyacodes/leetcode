package Leetcode75;
/*
Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
1431. Kids With the Greatest Number of Candies
 */
import java.util.*;
public class L03_Easy1431_Kids_With_the_Greatest_Number_of_Candies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int n = candies.length;
        int maxCandies = Integer.MIN_VALUE;

        // Counting Max Candy
        for(int i=0; i<n; i++){
            if(candies[i]>maxCandies){
                int temp = candies[i];
                maxCandies = temp;
                candies[i] = maxCandies;
            }
        }

        // Checking each kid having greatest number of candies
        for(int i=0; i<n; i++){
            if((candies[i] + extraCandies) >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
    // TC = O(N)
    // SC = O(1)

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        for(int i=0; i<result.size(); i++) {
            System.out.print(result.get(i)+" ");
        }
    }
}
