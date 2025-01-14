package Medium;
/*
Link: https://leetcode.com/problems/4sum/description/
18. 4Sum
Topics: Arrays, two Pointers
 */
import java.util.*;
public class Medium18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        // SOrting the array
        Arrays.sort(nums);

        // Two Pointers Approach
        for(int i=0; i<n-3; i++) {

            // Optimizing i index
            if(i>0 && nums[i] == nums[i-1]) continue;

            for(int j=i+1; j<n-2; j++) {

                // OPtimizing j index
                if (j>i+1 && nums[j] == nums[j-1]) continue;

                int p = j+1;
                int q = n-1;

                while(p<q) {
                    long sum = (long) nums[i] + nums[j] + nums[p] + nums[q]; // Used long to avoid overflow

                    if(sum<target) {
                        p++;
                    } else if(sum>target) {
                        q--;
                    } else { // sum == target
                        result.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                        p++;
                        q--;

                        // Optimizing p index
                        while(p<q && nums[p] == nums[p-1]) p++;

                        // Optimizing p index
                        while(p<q && nums[q] == nums[q+1]) q--;
                    }
                }
            }
        }
        return result;
    }
    // TC = O(n^3)
    // SC = O(k) where k = number of quadruplets

    public static void main(String[] args) {
        List<List<Integer>> result1 = fourSum(new int[]{1,0,-1,0,-2,2}, 0);
        List<List<Integer>> result2 = fourSum(new int[]{2,2,2,2,2}, 8);
        List<List<Integer>> result3 = fourSum(new int[]{-2,-1,-1,1,1,2,2}, 0);
        List<List<Integer>> result4 = fourSum(new int[]{1000000000, 1000000000, 1000000000, 1000000000}, -294967296); // Edge case
        System.out.println(result1); // [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
        System.out.println(result2); // [[2,2,2,2]]
        System.out.println(result3); // [[-2,-1,1,2],[-1,-1,1,1]]
        System.out.println(result4); // []
    }
}
