package M02_February2025;
/*
Link: https://www.geeksforgeeks.org/problems/k-closest-points-to-origin--172242/1
K Closest Points to Origin
 */
import java.util.*;
public class G250218_Medium_K_Closest_Points_to_Origin {
    public int[][] kClosest(int[][] p, int k) {
        Arrays.sort(p, Comparator.comparingInt(a -> a[0] * a[0] + a[1] * a[1]));
        return Arrays.copyOfRange(p, 0, k);
    }
    // time = O(n log n)
    // space = O(n)
}
