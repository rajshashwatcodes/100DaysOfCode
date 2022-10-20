import java.util.*;

public class factorial {

    public static void printFactorial(int n) {
        // loop
        if(n < 0 ) {
            System.out.println("Invalid Number");
            return;
        }
        int facto = 1;
        for(int i = n; i >= 1; i--) {
            facto = facto * i;
        }

        System.out.println("The factorial is: " + facto);
        return;

    }
    public static void main(String args[]) {
        System.out.print("Enter a number to find factorial: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }
}
