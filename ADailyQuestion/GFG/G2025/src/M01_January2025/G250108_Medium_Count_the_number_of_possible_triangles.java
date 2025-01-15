package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/count-possible-triangles-1587115620/1
Count the number of possible triangles
Topics: Array, Sorting
 */
import java.util.Arrays;
public class G250108_Medium_Count_the_number_of_possible_triangles {
    // Function to count the number of possible triangles.
    public static int countTriangles(int arr[]) {
        Arrays.sort(arr); // Sort the array to simplify the process
        int n = arr.length;
        int count = 0;

        // Iterate through the array to find valid triangles
        for (int i = n - 1; i >= 2; i--) {
            int left = 0, right = i - 1;
            while (left < right) {
                if (arr[left] + arr[right] > arr[i]) {
                    // All elements from left to right-1 can form a triangle with arr[i]
                    count += (right - left);
                    right--;
                } else {
                    left++;
                }
            }
        }

        return count;
    }
    // TC = O(N^2)
    // SC = O(1)

    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 7};
        System.out.println(countTriangles(arr)); // 3
    }
}
