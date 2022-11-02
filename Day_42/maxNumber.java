import java.util.*;

public class maxNumber {
    public static void main(String args[]) {
        System.out.println("To find the maximum of three numbers:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 'a': ");
        int a = sc.nextInt();
        System.out.print("Enter a number 'b': ");
        int b = sc.nextInt();
        System.out.print("Enter a number 'c': ");
        int c = sc.nextInt();
        if(a > b) {
            if(a > c) {
                System.out.println("The number 'a' = " + a + " is maximum.");
            }
            else {
                System.out.println("The number 'c' = " + c + " is maximum.");
            }
        }
        else {
            System.out.println("The number 'b' = " + b + " is maximum.");
        }
        sc.close();
    }
}
