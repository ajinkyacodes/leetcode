package Array;

public class LinearSearch {
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return index if found
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        int result = search(arr, key);
        System.out.println("Element found at index: " + result);
    }
    // Output: Element found at index: 2
}
