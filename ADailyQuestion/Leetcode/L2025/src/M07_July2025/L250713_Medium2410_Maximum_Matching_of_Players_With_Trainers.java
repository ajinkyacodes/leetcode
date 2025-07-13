package M07_July2025;
/*
Link: https://leetcode.com/problems/maximum-matching-of-players-with-trainers/description/
2410. Maximum Matching of Players With Trainers
 */
import java.util.*;
public class L250713_Medium2410_Maximum_Matching_of_Players_With_Trainers {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int m = players.length;
        int n = trainers.length;
        int count = 0;

        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (players[i] <= trainers[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return count;
    }
    // time = O(mlogm+nlogn).
    // space = O(logm+logn).
}
