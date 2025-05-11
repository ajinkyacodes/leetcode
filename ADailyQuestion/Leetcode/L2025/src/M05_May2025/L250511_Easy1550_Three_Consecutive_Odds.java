package M05_May2025;
/*
Link: .com/problems/three-consecutive-odds/description/
1550. Three Consecutive Odds
 */
public class L250511_Easy1550_Three_Consecutive_Odds {
    // Approach 3: Product of Three Numbers
    public boolean threeConsecutiveOdds(int[] arr) {
        // Loop through the array up to the third-to-last element
        for (int i = 0; i < arr.length - 2; i++) {
            int product = arr[i] * arr[i + 1] * arr[i + 2];
            // Check if the product is odd
            if (product % 2 == 1) return true;
        }
        return false;
    }
    // time = O(n)
    // space = O(1)
}
