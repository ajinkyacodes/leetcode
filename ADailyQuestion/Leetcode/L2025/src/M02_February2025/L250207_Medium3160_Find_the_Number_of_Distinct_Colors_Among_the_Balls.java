package M02_February2025;
/*
Link: https://leetcode.com/problems/find-the-number-of-distinct-colors-among-the-balls/description/
3160. Find the Number of Distinct Colors Among the Balls
Topic: Hash Table
 */
import java.util.*;
public class L250207_Medium3160_Find_the_Number_of_Distinct_Colors_Among_the_Balls {
    public static int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        int[] result = new int[n];
        Map<Integer, Integer> colorMap = new HashMap<>();
        Map<Integer, Integer> ballMap = new HashMap<>();

        // Iterate through queries
        for (int i = 0; i < n; i++) {
            // Extract ball label and color from query
            int ball = queries[i][0];
            int color = queries[i][1];

            // Check if ball is already colored
            if (ballMap.containsKey(ball)) {
                // Decrement count of the previous color on the ball
                int prevColor = ballMap.get(ball);
                colorMap.put(prevColor, colorMap.get(prevColor) - 1);

                // If there are no balls with previous color left, remove color from color map
                if (colorMap.get(prevColor) == 0) {
                    colorMap.remove(prevColor);
                }
            }
            // Set color of ball to the new color
            ballMap.put(ball, color);

            // Increment the count of the new color
            colorMap.put(color, colorMap.getOrDefault(color, 0) + 1);

            result[i] = colorMap.size();
        }
        return result;
    }
    // time = O(n)
    // space = O(n)

    public static void main(String[] args) {
        System.out.println(Arrays.toString(queryResults(4, new int[][]{{1,4},{2,5},{1,3},{3,4}}))); // [1,2,2,3]
        System.out.println(Arrays.toString(queryResults(4, new int[][]{{0,1},{1,2},{2,2},{3,4},{4,5}}))); // [1,2,2,3,4]
    }
}
