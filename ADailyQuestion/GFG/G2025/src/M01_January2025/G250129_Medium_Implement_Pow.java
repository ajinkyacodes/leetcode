package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/powx-n/1
Implement Pow
 */
public class G250129_Medium_Implement_Pow {
    public static double power(double b, int e) {
        if (e == 0) return 1.0;
        double half = power(b, e / 2);
        return e % 2 == 0 ? half * half : (e > 0 ? b * half * half : (1.0 / b) * half * half);
    }
    // time = O(log e)
    // space = O(log e)

    public static void main(String[] args) {
        double b1 = 3.00000;
        int e1 = 5;
        System.out.println(power(b1,e1)); // 243.00000

        double b2 = 0.16638;
        int e2 = 3;
        System.out.println(power(b2,e2)); // 0.16638

        double b3 = -0.67000;
        int e3 = -7;
        System.out.println(power(b3,e3)); // -16.49971
    }
}
