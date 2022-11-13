import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter an opertaor(+ , - , * , / , %): ");
        String operator = sc.next();
        System.out.print("Enter another number: ");
        double num2 = sc.nextDouble();
        switch(operator) {
            case "+" : System.out.println("The sum is: " + (num1 + num2));
                        break;
            case "-" : System.out.println("The difference is: " + (num1 - num2));
                        break;
            case "*" : System.out.println("The product is: " + (num1 * num2));
                        break;
            case "/" : System.out.println("The quotient is: " + (num1 / num2));
                        break;
            case "%" : System.out.println("The remainder is: " + (num1 % num2));
                        break;
            default : System.out.println("Operator unacceptable!");
            sc.close();
        }
    }
}
