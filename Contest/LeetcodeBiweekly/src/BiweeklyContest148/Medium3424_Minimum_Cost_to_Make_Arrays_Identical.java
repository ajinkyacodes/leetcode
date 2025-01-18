package BiweeklyContest148;
/*
Link: https://leetcode.com/problems/minimum-cost-to-make-arrays-identical/description/
3424. Minimum Cost to Make Arrays Identical
 */
import java.util.*;
public class Medium3424_Minimum_Cost_to_Make_Arrays_Identical {

    public static long minCost(int[] arr, int[] brr, long k) {
        int n = arr.length;
        long cost = 0;
        long costR = 0;

        for(int i=0; i<n; i++) {
            cost += Math.abs(arr[i]-brr[i]);
        }

        Arrays.sort(arr);
        Arrays.sort(brr);

        // calculate total cost after soring
        for(int i=0; i<n; i++) {
            costR +=  Math.abs(arr[i]-brr[i]);
        }

        costR += k;

        return Math.min(cost, costR);
    }
    // TC = O(n log n)
    // SC = O(n)

    public static void main(String[] args) {
        int[] arr1 = {-7,9,5};
        int[] brr1 = {7,-2,-5};
        int k1 = 2;
        System.out.println(minCost(arr1, brr1, k1)); // 13

        int[] arr2 = {2,1};
        int[] brr2 = {2,1};
        int k2 = 0;
        System.out.println(minCost(arr2, brr2, k2)); // 0

        int[] arr3 = {-9};
        int[] brr3 = {9};
        int k3 = 29;
        System.out.println(minCost(arr3, brr3, k3)); // 18

        int[] arr4 = {8,-1};
        int[] brr4 = {4,-6};
        int k4 = 7;
        System.out.println(minCost(arr4, brr4, k4)); // 9

        int[] arr5 = {3,10};
        int[] brr5 = {4,3};
        int k5 = 15;
        System.out.println(minCost(arr5, brr5, k5)); // 8

        int[] arr6 = {-7,4};
        int[] brr6 = {9,-6};
        int k6 = 17;
        System.out.println(minCost(arr6, brr6, k6)); // 23
    }
}
