package M03_March2025;
/*
Link: https://www.geeksforgeeks.org/problems/count-ways-to-reach-the-nth-stair-1587115620/1
Ways to Reach the n'th Stair
 */
public class G250311_Medium_Ways_to_Reach_the_n_th_Stair {
    public long countWays(int n) {
        long a = 1, b = 1;
        while (n-- > 1) {
            b += a;
            a = b - a;
        }
        return b;
    }
    // time = O(n)
    // space = O(1)
}
