import java.util.*;

public class primeOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 100: ");
        int n = sc.nextInt();
        int shashwat = 0;
        int i = 2;
        sc.close();
        if(n < 1) {
            System.out.println("Invalid");
        }
        else if( n == 1) {
            System.out.println("co-prime");
        }
        else {
            for(i = 2 ; i < n ; i++) {
                if(n % i == 0) {
                    shashwat = 1;
                }
            }
            if(shashwat == 1) {
                System.out.println("Not prime");
            }
            else {
                System.out.println("Prime");
            }
        }
        
    }
}
