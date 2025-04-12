package M04_April2025;

/*
Link: https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-ii/description/
2874. Maximum Value of an Ordered Triplet II
 */
public class L250403_Medium2874_Maximum_Value_of_an_Ordered_Triplet_II {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long res = 0, imax = 0, dmax = 0;
        for (int k = 0; k < n; k++) {
            res = Math.max(res, dmax * nums[k]);
            dmax = Math.max(dmax, imax - nums[k]);
            imax = Math.max(imax, nums[k]);
        }
        return res;
    }
    // time = O(n)
    // space = O(1)
}
