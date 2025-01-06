package Jan2025;
/*
Link: https://www.geeksforgeeks.org/problems/count-all-triplets-with-given-sum-in-sorted-array/1
Count all triplets with given sum in sorted array
Topics: Two Pointers, Hash
 */
public class G250104 {
    public static int countTriplets(int[] arr, int target) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

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
        }

        return count;
    }
    // TC = O(N^2)
    // SC = O(1)

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(countTriplets(arr, target)); // 20
    }
}
