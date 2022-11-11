import java.util.*;

public class positiveOrNegative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To find if the number is negative or positive");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num < 0) {
            System.out.println("Negative");
        }
        else {
            if(num == 0) {
                System.out.println("Neither negative nor positive");
            }
            else {
                System.out.println("Positive");
            }
        }
        sc.close();
    }
}
