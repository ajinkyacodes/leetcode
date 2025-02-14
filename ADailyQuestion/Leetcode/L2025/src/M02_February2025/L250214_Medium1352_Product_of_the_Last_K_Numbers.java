package M02_February2025;
/*
Link: https://leetcode.com/problems/product-of-the-last-k-numbers/description/
1352. Product of the Last K Numbers
 */
import java.util.*;
public class L250214_Medium1352_Product_of_the_Last_K_Numbers {
    // Stores cumulative product of the stream
    private ArrayList<Integer> prefixProduct = new ArrayList<>();
    private int size = 0;

    public L250214_Medium1352_Product_of_the_Last_K_Numbers() {
        // Initialize the product list with 1 to handle multiplication logic
        this.prefixProduct.add(1);
        this.size = 0;
    }

    public void add(int num) {
        if (num == 0) {
            // If num is 0, reset the cumulative products since multiplication
            // with 0 invalidates previous products
            this.prefixProduct = new ArrayList<Integer>();
            this.prefixProduct.add(1);
            this.size = 0;
        } else {
            // Append the cumulative product of the current number with the last
            // product
            this.prefixProduct.add(this.prefixProduct.get(size) * num);
            this.size++;
        }
    }

    public int getProduct(int k) {
        // Check if the requested product length exceeds the size of the valid
        // product list
        if (k > this.size) return 0;

        // Compute the product of the last k elements using division
        return (
                this.prefixProduct.get(this.size) /
                        this.prefixProduct.get(this.size - k)
        );
    }
    // time = O(n)
    // space = O(n)
}
