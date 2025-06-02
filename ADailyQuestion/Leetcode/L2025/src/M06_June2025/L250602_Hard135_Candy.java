package M06_June2025;
/*
Link: https://leetcode.com/problems/candy/description/
135. Candy
 */
import java.util.*;
public class L250602_Hard135_Candy {
    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);
        boolean hasChanged = true;
        while (hasChanged) {
            hasChanged = false;
            for (int i = 0; i < ratings.length; i++) {
                if (
                        i != ratings.length - 1 &&
                                ratings[i] > ratings[i + 1] &&
                                candies[i] <= candies[i + 1]
                ) {
                    candies[i] = candies[i + 1] + 1;
                    hasChanged = true;
                }
                if (
                        i > 0 &&
                                ratings[i] > ratings[i - 1] &&
                                candies[i] <= candies[i - 1]
                ) {
                    candies[i] = candies[i - 1] + 1;
                    hasChanged = true;
                }
            }
        }
        int sum = 0;
        for (int candy : candies) {
            sum += candy;
        }
        return sum;
    }
    // time = O(n^2)
    // space = O(n)
}
