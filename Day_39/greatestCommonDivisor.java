import java.util.*;

public class greatestCommonDivisor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
 
        while(n1 != n2) { 
            if(n1>n2) {
                n1 = n1 - n2;
            }
            else {
                n2 = n2 - n1;
            } 
        }
        System.out.println("GCD is : " + n2);
        sc.close();
   }   
}
