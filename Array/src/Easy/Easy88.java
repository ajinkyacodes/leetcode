package Easy;
/*
Leetcode: https://leetcode.com/problems/merge-sorted-array/description/
#88 - Merge Sorted Array
*/
import java.util.Arrays;
public class Easy88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m+n];
        int i=0, j=0, k=0;

        while(i<m){
            nums3[k++] = nums1[i++];
        }

        while(j<n){
            nums3[k++] = nums2[j++];
        }

        Arrays.sort(nums3);

        for(i=0; i<m+n; i++){
            nums1[i]=nums3[i];
            System.out.print(nums3[i]+" ");
        }
    }
    // TC = O((m + n) log(m + n))
    // SC = O(m + n)

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
    }
}
