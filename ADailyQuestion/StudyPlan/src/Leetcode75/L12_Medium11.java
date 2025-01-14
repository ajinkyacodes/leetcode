package Leetcode75;
/*
Link: https://leetcode.com/problems/container-with-most-water/
11. Container With Most Water
Topics: Array, Two Pointers, Greedy
 */
import java.util.*;
public class L12_Medium11 {
    public static int maxArea(int[] height) {
        int maxWater = 0;
        int n = height.length;
        int left = 0;
        int right = n-1;

        while(left<right) {
            int w = right-left;
            int ht = Math.min(height[left], height[right]);
            int area = w * ht;
            maxWater = Math.max(maxWater, area);

            if(height[left]<height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
    // TC = O(n)
    // SC = O(1)

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7})); // 49
        System.out.println(maxArea(new int[]{1,1})); // 1
    }
}
