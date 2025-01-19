package Round998;

import java.util.*;
public class Fibonacciess {
    public static int calculateFibonacciness(int a1, int a2, int a4, int a5) {
        int maxFibonacciness = 0;

        // Case 1: Assume a3 satisfies a3 = a2 + a1
        int a3_case1 = a2 + a1;
        int fibCase1 = 0;
        if (a3_case1 == a2 + a1) fibCase1++;
        if (a4 == a3_case1 + a2) fibCase1++;
        if (a5 == a4 + a3_case1) fibCase1++;
        maxFibonacciness = Math.max(maxFibonacciness, fibCase1);

        // Case 2: Assume a3 satisfies a4 = a3 + a2
        int a3_case2 = a4 - a2;
        int fibCase2 = 0;
        if (a3_case2 == a2 + a1) fibCase2++;
        if (a4 == a3_case2 + a2) fibCase2++;
        if (a5 == a4 + a3_case2) fibCase2++;
        maxFibonacciness = Math.max(maxFibonacciness, fibCase2);

        // Case 3: Assume a3 satisfies a5 = a4 + a3
        int a3_case3 = a5 - a4;
        int fibCase3 = 0;
        if (a3_case3 == a2 + a1) fibCase3++;
        if (a4 == a3_case3 + a2) fibCase3++;
        if (a5 == a4 + a3_case3) fibCase3++;
        maxFibonacciness = Math.max(maxFibonacciness, fibCase3);

        return maxFibonacciness;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        int[] results = new int[t];

        for (int i = 0; i < t; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a4 = sc.nextInt();
            int a5 = sc.nextInt();
            results[i] = calculateFibonacciness(a1, a2, a4, a5);
        }

        for (int res : results) {
            System.out.println(res);
        }
    }
}
