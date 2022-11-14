import java.util.*;

public class leapYear {
    public static void main(String args[]) {
        System.out.println("To check if it is a leap year.");
        System.out.print("Enter a year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 100 == 0)  {
            if( year % 400 == 0) {
                System.out.println("It is a leap year!");
            }
            else {
                System.out.println("It is not a leap year!");
            }
        }
        else if(year % 4 == 0) {
            System.out.println("It is a leap year!");
        }
        else {
            System.out.println("It a not a leap year!");
        }
        sc.close();
    }
}
