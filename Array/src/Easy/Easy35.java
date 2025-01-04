package Easy;
/*
Link: https://leetcode.com/problems/search-insert-position/description/
35. Search Insert Position
*/
public class Easy35 {
    public static int searchInsert(int[] nums, int target) {
        int position=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
    // TC = O(N)
    // SC = O(1)

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums,target));
    }
}
