package GFGWeekly190;
/*
Minimum Sum
 */
import java.util.*;
public class Minimum_Sum {
    public static long minimumSum(int[] arr, int[] change, int k) {
        int n = arr.length;
        int[] diff = new int[n];
        for(int i=0; i<n; i++){
            diff[i] = change[i] - arr[i];
        }

        Arrays.sort(diff);

        long sum = 0;

        for(int i=0; i<n; i++){
            sum += arr[i];
        }

        for(int i=0; i<k; i++) {
            sum += diff[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1= {1,2,3};
        int[] change1= {3,3,3};
        int k1 = 2;
        System.out.println(minimumSum(arr1,change1,k1));// 7

        int[] arr2= {2};
        int[] change2= {0};
        int k2 = 1;
        System.out.println(minimumSum(arr2,change2,k2));// 0
    }
}
