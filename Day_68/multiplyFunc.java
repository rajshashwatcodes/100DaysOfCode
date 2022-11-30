import java.util.*;

public class multiplyFunc {

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }
    public static void main(String args[]) {
        System.out.println("To find the product of two numbers:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        sc.close();
        int product = multiply(a, b);
        System.out.println("The product of the two numbers is: " + product);
    }
}
