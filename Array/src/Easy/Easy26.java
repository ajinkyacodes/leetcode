package Easy;
/*
Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
#26 - Remove Duplicates from Sorted Array
*/
public class Easy26 {
    public static int removeDuplicates(int[] nums) {
        //TODO
        if(nums.length == 0){
            return 0;
        }

        int i = 0;

        for(int j=1; j<nums.length; j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }

        return i+1;
    }
    // TC = O(N)
    // SC = O(1)

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(nums));
    }
}
