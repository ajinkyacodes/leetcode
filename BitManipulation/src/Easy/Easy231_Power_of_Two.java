package Easy;
/*
Link: https://leetcode.com/problems/power-of-two/description/
231. Power of Two
 */
public class Easy231_Power_of_Two {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        if((n & (n-1)) == 0) {
            return true;
        }
        return false;
    }
    // time = O(1)
    // space = O(1)
}
