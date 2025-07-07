package Applications;

public class PowerOfTwo {
    public static void checkPowerOfTwo(int n) {
        if((n & (n-1)) == 0) {
            System.out.println("Yes, It's power of two.");
        } else {
            System.out.println("No, It's not a power of two.");
        }
    }

    public static void main(String[] args) {
        // PowerOfTwo Examples: 1,2,4,8,16,32,64,128,256 etc.
        int num = 256;
        checkPowerOfTwo(num);
    }
}
