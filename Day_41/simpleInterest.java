import java.util.*;

public class simpleInterest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal(in Rs.): ");
        int p = sc.nextInt() ;
        System.out.print("Enter the rate in %: ");
        int r = sc.nextInt() ;
        System.out.print("Enter the time(in years): ");
        int t = sc.nextInt() ;
        int SI = (p * r * t) / 100 ;
        System.out.println("The Simple Interest(in Rs.): " + SI);
        sc.close();
    }
}
