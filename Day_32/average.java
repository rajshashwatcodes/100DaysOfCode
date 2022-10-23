import java.util.*;

public class average {
    public static double averageNumber(double a, double b, double c ) {
        return (a + b + c)/3 ;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();
        sc.close();
        System.out.println("The average is: " + averageNumber(num1 , num2 , num3));
    }
    
}
