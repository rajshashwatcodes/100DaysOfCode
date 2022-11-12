import java.util.*;

public class ternaryOperator {
    public static void main(String args[]) {
        /*ternary operator takes three operators 
          it is a different way of writing if else programs 
          
          variable = condition? statement1 : statement2;
          'statement1 denotes True and statement2 denotes False'
          int larger = (5 > 3)? 5 : 3;
          String type = (5 % 2 == 0)? "even" : "odd"; */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // check if the number is odd or even using ternary operator
        String type = (number % 2 == 0)? "even" : "odd";
        System.out.println(type);
        sc.close();
    }
}
