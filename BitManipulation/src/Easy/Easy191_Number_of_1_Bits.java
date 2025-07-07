package Easy;
/*
Link: https://leetcode.com/problems/number-of-1-bits/description/
191. Number of 1 Bits
 */
public class Easy191_Number_of_1_Bits {
    public int hammingWeight(int n) {
        int count = 0;
        while(n>0){
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
    // time = O(log n)
    // space = O(1)
}

/*
✅ Explanation:

1. int count = 0;
This initializes the counter for the number of 1 bits found.

2. while(n > 0)
Loop as long as n is not 0.

This will go through each bit of n from least significant bit (LSB) to most significant bit (MSB).

3. count += n & 1;
n & 1 masks all bits except the least significant bit.

It will be 1 if the current bit is 1, else 0.

So, this line adds 1 to count if the current bit is set.

Example:

If n = 11 → binary 1011

n & 1 → 1011 & 0001 = 0001 → Adds 1

Right shift n → 1011 >> 1 → 0101

4. n >>= 1;
Right shifts n by 1 bit (n = n >> 1)

This discards the current bit (least significant) and moves to the next.

5. return count;
After the loop ends, return the total number of 1s found — the Hamming Weight.


✅ Example Walkthrough
Let’s take n = 11 → Binary: 1011

Step	n (binary)	n & 1	Count	After n >>= 1
1	       1011	      1	      1	         0101
2	       0101	      1	      2	         0010
3	       0010	      0	      2	         0001
4	       0001	      1	      3	         0000

✅ Final count = 3

 */
