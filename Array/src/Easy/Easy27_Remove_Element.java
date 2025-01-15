package Easy;
/*
Link: https://leetcode.com/problems/remove-element/description/
27. Remove Element
*/
public class Easy27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int n= nums.length;
        int count = 0;
        for(int i=0; i<n; i++){
            if(nums[i]==val){
                nums[i] = -1;
            }
            if(nums[i] != -1) {
                count++;
            }
        }
        for(int i=0, k=0; i<n; i++){
            if(nums[i] == -1) {
                continue;
            }
            nums[k++]=nums[i];
        }
        return count;
    }
    // TC = O(N)
    // SC = O(1)

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }
}
