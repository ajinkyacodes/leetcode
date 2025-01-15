package Medium;
/*
Link: https://leetcode.com/problems/product-of-array-except-self/description/
238. Product of Array Except Self
Topics: Array, Prefix Sum
 */
public class Medium238_Product_of_Array_Except_Self {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Step 1: Calculate prefix products
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = prefix;
            prefix *= nums[i];
        }

        // Step 2: Calculate suffix products and update the answer array
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;
    }
    // TC = O(N)
    // SC = O(1)

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = productExceptSelf(nums);
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i]+" "); // [24,12,8,6]
        }
    }
}
