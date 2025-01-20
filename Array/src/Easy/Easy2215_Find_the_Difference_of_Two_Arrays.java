package Easy;
/*
Link: https://leetcode.com/problems/find-the-difference-of-two-arrays/description/
2215. Find the Difference of Two Arrays
Topics: Array, Hash Table
 */
import java.util.*;

public class Easy2215_Find_the_Difference_of_Two_Arrays {
    public static List<Integer> getElementsOnlyInFirstList(int[] nums1, int[] nums2) {
        Set<Integer> onlyInNums1 = new HashSet<> ();

        // Store nums2 elements in an unordered set.
        Set<Integer> existsInNums2 = new HashSet<> ();
        for (int num : nums2) {
            existsInNums2.add(num);
        }

        // Iterate over each element in the list nums1.
        for (int num : nums1) {
            if (!existsInNums2.contains(num)) {
                onlyInNums1.add(num);
            }
        }

        // Convert to vector.
        return new ArrayList<>(onlyInNums1);
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getElementsOnlyInFirstList(nums1, nums2), getElementsOnlyInFirstList(nums2, nums1));
    }
    // TC = O(n + m)
    // SC = O(n + m)

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        List<List<Integer>> result1 = findDifference(nums1, nums2);
        System.out.println(result1);

        int[] nums3 = {1,2,3,3};
        int[] nums4 = {1,1,2,2};
        List<List<Integer>> result2 = findDifference(nums3, nums4);
        System.out.println(result2);
    }
}
