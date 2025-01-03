package Hard;
/*
Link: https://leetcode.com/problems/median-of-two-sorted-arrays/description/
#4 - Median of Two Sorted Arrays
*/
import java.util.Arrays;
public class Hard4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n3 = n1+n2; // Temp Array Length
        int i=0, j=0, k=0;
        int middle, firstMedian, secondMedian;
        float median, averageMedian;

        // Temp Array
        int[] nums3 = new int[n3];

        // Traverse num1 array and insert it's elements to nums3 array
        while(i<n1){
            nums3[k++] = nums1[i++];
        }

        // Traverse num2 array and insert it's elements to nums3 array
        while(j<n2){
            nums3[k++] = nums2[j++];
        }

        // Sort Temp Array
        Arrays.sort(nums3);

        // Print Sorted Temp Array (Debugging)
        System.out.println("Printing Sorted Temp Array");
        for(int l=0; l<n3; l++){
            System.out.print(nums3[l]+" ");
        }
        System.out.println("\n");

        if(n3 == 1 ){
            return nums3[0];
        } else if(n3%2==0){ //Even
            firstMedian = (n3/2)-1;
            secondMedian = firstMedian+1;
            averageMedian = (float)(nums3[firstMedian]+nums3[secondMedian])/2;
            return averageMedian;
        } else {
            middle = n3/2;
            median = (float)nums3[middle];
            return median;
        }
    }
    // TC = O((n1 + n2) log(n1 + n2))
    // SC = O(n1 + n2)

    public static void main(String[] args) {
        Hard4 main = new Hard4();
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(main.findMedianSortedArrays(nums1, nums2));
    }
}
