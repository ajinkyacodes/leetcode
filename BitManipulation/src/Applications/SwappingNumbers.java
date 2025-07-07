package Applications;

public class SwappingNumbers {
    public static void swapNumbers(int A, int B){
        System.out.println("Before swapping");
        System.out.println("Value of A = "+A);
        System.out.println("Value of B = "+B);

        A = A ^ B;
        B = A ^ B;
        A = A ^ B;

        System.out.println("After swapping");
        System.out.println("Value of A = "+A);
        System.out.println("Value of B = "+B);
    }

    public static void main(String[] args) {
        int A = 15;
        int B = 25;
        swapNumbers(A,B);
    }
}
