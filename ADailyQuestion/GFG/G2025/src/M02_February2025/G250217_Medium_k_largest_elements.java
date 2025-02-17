package M02_February2025;
/*
Link:https://www.geeksforgeeks.org/problems/k-largest-elements4206/1
k largest elements
 */
import java.util.*;
public class G250217_Medium_k_largest_elements {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        Arrays.sort(arr);
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = arr.length - 1; i >= arr.length - k; i--) res.add(arr[i]);
        return res;
    }
}
