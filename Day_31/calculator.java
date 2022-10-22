package day14;

import java.util.*;

public class calculator {
    public static void main(String args[]) {
        System.out.println("Welcome to the Calculator");

        System.out.print("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Choose an operator: '+' , '-' , '*' , '/' ");
        String operator = sc.next();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        if(operator == "+") {
            int sum = a + b;
            System.out.println("The sum of two numbers is: " + sum);
        }
        else if(operator == "-") {
            int difference = a - b;
            System.out.println("The difference between the two numbers is: " + difference);
        }
        else if(operator == "*") {
            int product = a * b;
            System.out.println("The product of two numbers is: " + product);
        }
        else if(operator == "/") {
            int quotient = a / b;
            System.out.println("The quotient of two numbers is: " + quotient);
        }
        
        else {
            System.out.println("Invalid operator!");
        }
    }
}
