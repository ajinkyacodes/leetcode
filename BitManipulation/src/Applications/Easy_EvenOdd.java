package Applications;

import java.util.Scanner;

public class Easy_EvenOdd {
    public static int checkEvenOdd(int num) {
        if((num & 1) == 1){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        int ans = checkEvenOdd(num);
        if(ans == 1) {
            System.out.println(num+" is odd.");
        } else if(ans == 0) {
            System.out.println(num+" is even.");
        } else {
            System.out.println("Unknown number");
        }
    }
}
