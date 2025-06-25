package M06_June2025;
/*
Link: https://leetcode.com/problems/kth-smallest-product-of-two-sorted-arrays/description/
2040. Kth Smallest Product of Two Sorted Arrays
 */
public class L250625_Hard2040_Kth_Smallest_Product_of_Two_Sorted_Arrays {
    int f(int[] nums2, long x1, long v) {
        int n2 = nums2.length;
        int left = 0, right = n2 - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            long prod = (long) nums2[mid] * x1;
            if ((x1 >= 0 && prod <= v) || (x1 < 0 && prod > v)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (x1 >= 0) {
            return left;
        } else {
            return n2 - left;
        }
    }

    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        int n1 = nums1.length;
        long left = -10000000000L, right = 10000000000L;
        while (left <= right) {
            long mid = (left + right) / 2;
            long count = 0;
            for (int i = 0; i < n1; i++) {
                count += f(nums2, nums1[i], mid);
            }
            if (count < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
    // time = O(n1 logn2 logC).
    // space = O(1).
}
