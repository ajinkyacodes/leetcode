package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/container-with-most-water0535/1
Container With Most Water
 */
public class G250113_Medium {
    public static int maxWater(int arr[]) {
        int maxArea = 0;
        int left = 0;
        int right = arr.length -1;

        // Two Pointer Approach
        while(left<right) {
            int height = Math.min(arr[left], arr[right]);
            int width = right-left;

            int area = height * width;

            maxArea = Math.max(maxArea, area);

            if(arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
    // TC = O(N)
    // SC = O(1)

    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 3};
        System.out.println(maxWater(arr)); // 6
    }
}
