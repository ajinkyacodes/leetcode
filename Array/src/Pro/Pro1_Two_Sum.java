package Pro;

import java.util.HashMap;

/*
Link: https://leetcode.com/problems/two-sum/description/
1. Two Sum
FAANG : Amazon
*/
public class Pro1_Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            int balance = target - nums[i];
            if(map.containsKey(balance)) {
                return new int[] {map.get(balance),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    // TC = O(n)
    // SC = O(n)

    public static void main(String[] args) {
        int[] nums  = {2,7,11,15};
        int target = 9;
        int[] newArray = twoSum(nums, target);
        for(int i=0; i<newArray.length; i++){
            System.out.print(newArray[i]+" "); // [0,1]
        }
    }
}
