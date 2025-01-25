package M01_January2025;
/*
Link: https://leetcode.com/problems/make-lexicographically-smallest-array-by-swapping-elements/description/
2948. Make Lexicographically Smallest Array by Swapping Elements
Topic: Array, Hash Table
 */
import java.util.*;
public class L250125_Medium2948_Make_Lexicographically_Smallest_Array_by_Swapping_Elements {
    public static int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int[] numsSorted = new int[nums.length];
        for (int i = 0; i < nums.length; i++) numsSorted[i] = nums[i];
        Arrays.sort(numsSorted);

        int currGroup = 0;
        HashMap<Integer, Integer> numToGroup = new HashMap<>();
        numToGroup.put(numsSorted[0], currGroup);

        HashMap<Integer, LinkedList<Integer>> groupToList = new HashMap<>();
        groupToList.put(
                currGroup,
                new LinkedList<Integer>(Arrays.asList(numsSorted[0]))
        );

        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(numsSorted[i] - numsSorted[i - 1]) > limit) {
                // new group
                currGroup++;
            }

            // assign current element to group
            numToGroup.put(numsSorted[i], currGroup);

            // add element to sorted group list
            if (!groupToList.containsKey(currGroup)) {
                groupToList.put(currGroup, new LinkedList<Integer>());
            }
            groupToList.get(currGroup).add(numsSorted[i]);
        }

        // Overwrite each element with the next element in its corresponding group
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int group = numToGroup.get(num);
            nums[i] = groupToList.get(group).pop();
        }

        return nums;
    }
    // Time = O(n log n)
    // Space = O(n)

    public static void main(String[] args) {
        int[] result1 = lexicographicallySmallestArray(new int[]{1,5,3,9,8}, 2);
        System.out.println(Arrays.toString(result1)); // [1,3,5,8,9]

        int[] result2 = lexicographicallySmallestArray(new int[]{1,7,6,18,2,1}, 3);
        System.out.println(Arrays.toString(result2)); // [1,6,7,18,1,2]

        int[] result3 = lexicographicallySmallestArray(new int[]{1,7,28,19,10}, 3);
        System.out.println(Arrays.toString(result3)); // [1,7,28,19,10]
    }
}
