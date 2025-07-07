package Applications;

public class OppositeSigns {
    public static void checkOppositeSigns(int A, int B) {
        if((A ^ B) < 0){
            System.out.println("Yes, Opposite Signs");
        }  else {
            System.out.println("No, Not Opposite");
        }
    }

    public static void main(String[] args) {
        checkOppositeSigns(15,-15); // Here first value 15 is "Positive", second value -15 is "Negative". Hence, Opposite
        checkOppositeSigns(10,10); // Here first value 10 is "Positive", second value 10 is "Positive". Hence, Not Opposite
    }
}
