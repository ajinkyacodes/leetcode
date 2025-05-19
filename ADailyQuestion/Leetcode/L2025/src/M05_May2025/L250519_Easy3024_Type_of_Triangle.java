package M05_May2025;

import java.util.Arrays;

/*
Link: https://leetcode.com/problems/type-of-triangle/description/
3024. Type of Triangle
 */
public class L250519_Easy3024_Type_of_Triangle {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] + nums[1] <= nums[2]) {
            return "none";
        } else if (nums[0] == nums[2]) {
            return "equilateral";
        } else if (nums[0] == nums[1] || nums[1] == nums[2]) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
    // time = O(1)
    // space = O(1)
}
