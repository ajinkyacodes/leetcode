package Leetcode75;
/*
Link: https://leetcode.com/problems/max-number-of-k-sum-pairs/solutions/
1679. Max Number of K-Sum Pairs
Topics: Array, Hash Table, Two Pointers, Sorting
 */
import java.util.*;
public class L13_Medium1679 {
    public static int maxOperations(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int count = 0;
        Arrays.sort(nums);
        while(left<right) {
            int sum = nums[left]+nums[right];
            if(sum == k) {
                left++;
                right--;
                count++;
            } else if(sum > k){
                right--;
            } else {
                left++;
            }
        }
        return count;
    }
    // TC = O(n log n)
    // SC = O(1)

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 5;
        System.out.println(maxOperations(nums, k)); // 2
    }
}
