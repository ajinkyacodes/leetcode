package M02_February2025;
/*
Link: https://leetcode.com/problems/count-number-of-bad-pairs/description/
2364. Count Number of Bad Pairs
Topic: Hash Table
 */
import java.util.*;
public class L250209_Medium2364_Count_Number_of_Bad_Pairs {
    public static long countBadPairs(int[] nums) {
        long badPairs = 0;
        Map<Integer, Integer> diffCount = new HashMap<>();

        for (int pos = 0; pos < nums.length; pos++) {
            int diff = pos - nums[pos];

            // Count of previous positions with same difference
            int goodPairsCount = diffCount.getOrDefault(diff, 0);

            // Total possible pairs minus good pairs = bad pairs
            badPairs += pos - goodPairsCount;

            // Update count of positions with this difference
            diffCount.put(diff, goodPairsCount + 1);
        }

        return badPairs;
    }
    // time = O(n)
    // space = O(n)

    public static void main(String[] args) {
        System.out.println(countBadPairs(new int[]{4,1,3,3})); // 5
        System.out.println(countBadPairs(new int[]{1,2,3,4,5})); // 0
    }
}
