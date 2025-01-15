package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1
Count distinct elements in every window
Topics: Array, Sliding Window, Hash
 */
import java.util.ArrayList;
import java.util.HashMap;
public class G250110_Easy_Count_distinct_elements_in_every_window {
    public static ArrayList<Integer> countDistinct(int arr[], int k) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Initialize the frequency map for the first window
        for (int i = 0; i < k; i++) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }
        result.add(frequencyMap.size());

        // Slide the window
        for (int i = k; i < n; i++) {
            // Remove the element going out of the window
            int outgoingElement = arr[i - k];
            if (frequencyMap.get(outgoingElement) == 1) {
                frequencyMap.remove(outgoingElement);
            } else {
                frequencyMap.put(outgoingElement, frequencyMap.get(outgoingElement) - 1);
            }

            // Add the new element coming into the window
            int incomingElement = arr[i];
            frequencyMap.put(incomingElement, frequencyMap.getOrDefault(incomingElement, 0) + 1);

            // Add the count of distinct elements to the result
            result.add(frequencyMap.size());
        }

        return result;
    }
    // TC = O(N)
    // SC = O(K)

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        ArrayList result = countDistinct(arr, k);
        for(int i=0; i<result.size(); i++) {
            System.out.print(result.get(i)+" "); // [3, 4, 4, 3]
        }
    }
}
