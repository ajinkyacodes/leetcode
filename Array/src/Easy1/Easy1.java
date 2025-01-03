package Easy1;
/*
Link: https://leetcode.com/problems/two-sum/description/
#1 - Two Sum
*/
public class Easy1 {
    public static int[] twoSum(int[] nums, int target) {
        // TODO
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
    // TC = O(N^2)
    // SC = O(1)

    public static void main(String[] args) {
        int[] nums  = {2,7,11,15};
        int target = 9;
        int[] newArray = twoSum(nums, target);
        for(int i=0; i<newArray.length; i++){
            System.out.print(newArray[i]+" ");
        }
    }
}
