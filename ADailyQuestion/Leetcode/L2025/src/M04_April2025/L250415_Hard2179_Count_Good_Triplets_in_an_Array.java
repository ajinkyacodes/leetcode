package M04_April2025;
/*
Link: https://leetcode.com/problems/count-good-triplets-in-an-array/description/
2179. Count Good Triplets in an Array
 */
public class L250415_Hard2179_Count_Good_Triplets_in_an_Array {
//
}

class FenwickTree {
    private int[] tree;

    public FenwickTree(int size) {
        tree = new int[size + 1];
    }

    public void update(int index, int delta) {
        index++;
        while (index < tree.length) {
            tree[index] += delta;
            index += index & -index;
        }
    }

    public int query(int index) {
        index++;
        int res = 0;
        while (index > 0) {
            res += tree[index];
            index -= index & -index;
        }
        return res;
    }
}

class Solution {

    public long goodTriplets(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] pos2 = new int[n], reversedIndexMapping = new int[n];
        for (int i = 0; i < n; i++) {
            pos2[nums2[i]] = i;
        }
        for (int i = 0; i < n; i++) {
            reversedIndexMapping[pos2[nums1[i]]] = i;
        }
        FenwickTree tree = new FenwickTree(n);
        long res = 0;
        for (int value = 0; value < n; value++) {
            int pos = reversedIndexMapping[value];
            int left = tree.query(pos);
            tree.update(pos, 1);
            int right = (n - 1 - pos) - (value - left);
            res += (long) left * right;
        }
        return res;
    }
    // time = O(n×logn)
    // space = O(n)
}
