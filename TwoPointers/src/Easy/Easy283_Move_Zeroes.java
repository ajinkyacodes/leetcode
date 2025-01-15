package Easy;
/*
Link: https://leetcode.com/problems/move-zeroes/description/
283. Move Zeroes
Topics:
 */
public class Easy283_Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int j=0;
        for(int i=0; i<n; i++) {
            if(nums[i]!=0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
    // TC = O(n)
    // SC = O(1)

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        //moveZeroesApproach2(nums);
        printArray(nums);
    }

    public static void moveZeroesApproach2(int[] nums) {
        int n = nums.length;
        int nonZeroIndex = 0;
        for(int i=0; i<n; i++) {
            if(nums[i]!=0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }

        // Setting all remaining elements to zero
        for(int i=nonZeroIndex; i<n; i++){
            nums[i] = 0;
        }
    }
    // TC = O(n)
    // SC = O(1)

    public static void printArray(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
