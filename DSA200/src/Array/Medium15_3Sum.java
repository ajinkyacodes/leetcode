package Array;
/*
Link: https://leetcode.com/problems/3sum/description/
15. 3Sum
Topics: Array, Two Pointers, Sorting
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Medium15_3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0; i<n; i++) {
            int j=i+1;
            int k = n-1;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while(j<k && nums[j] == nums[j+1]) {
                        j++;
                    }

                    while(j<k && nums[k] == nums[k-1]) {
                        k--;
                    }

                    j++;
                    k--;
                }

                if(sum<0) j++;
                if(sum>0) k--;
            }
        }

        return result;
    }
    // TC = O(n^2
    // SC = O(1)

    public static void main(String[] args) {
        List<List<Integer>> result = threeSum(new int[]{-1,0,1,2,-1,-4}); // [[-1,-1,2],[-1,0,1]]
        System.out.println(result);
    }
}
