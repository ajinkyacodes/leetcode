package M1_Jan2025;
/*
Link: https://www.geeksforgeeks.org/problems/pair-with-given-sum-in-a-sorted-array4940/1
Pair with given sum in a sorted array
Topics: Array, DSA, Two Pointers
 */
public class G250107_Easy {
    public static int countPairs(int arr[], int target) {
        int count = 0;
        int n = arr.length;

        int left = 0;
        int right = n-1;

        while(left<right) {
            int sum = arr[left]+arr[right];

            if (sum == target) {
                // Count the occurrences of the current values of left and right
                if (arr[left] == arr[right]) {
                    int freq = right - left + 1;
                    count += (freq * (freq - 1)) / 2; // Combination formula for pairs
                    break;
                } else {
                    int leftCount = 1;
                    int rightCount = 1;

                    // Count duplicates on the left
                    while (left + 1 < right && arr[left] == arr[left + 1]) {
                        leftCount++;
                        left++;
                    }

                    // Count duplicates on the right
                    while (right - 1 > left && arr[right] == arr[right - 1]) {
                        rightCount++;
                        right--;
                    }

                    count += leftCount * rightCount;
                    left++;
                    right--;
                }
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
    // TC = O(N)
    // SC = O(1)

    public static void main(String[] args) {
        int[] arr = {-1, 1, 5, 5, 7};
        int target = 6;
        System.out.println(countPairs(arr, target)); // 3
    }
}
