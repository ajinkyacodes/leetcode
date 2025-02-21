package Leetcode75;
/*
Link: https://leetcode.com/problems/guess-number-higher-or-lower/description/
374. Guess Number Higher or Lower
Approach: Using Binary Search
 */

/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class L52_Easy374_Guess_Number_Higher_or_Lower {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = guess(mid);
            if (res == 0)
                return mid;
            else if (res < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    // Hidden function in Leetcode
    public int guess(int num) {
        int pick = 6; // Example target number
        if (num > pick) return -1;
        if (num < pick) return 1;
        return 0;
    }

    // time = O(log n)
    // space = O(1)
}
