// importing java package
import java.util.Scanner;
public class ElectricBill {
        public static void main(String args[]) {
        // creating scanner object sc
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the units consumed: ");
        // taking units consumbed as input from the user
        Double units = sc.nextDouble();
        // check if the units is more than eqaul to 0 and less than eqaul to 50
        if(units >= 0 & units <= 50) {
            double bill = 0.50 * units;
            System.out.println("Units consumed: " + units + " units");
            System.out.println("Cost per unit: Rs.0.50");
            System.out.println("Your total bill is: Rs." + bill);
        }
        // check if the units is not less than 0
        else if(units < 0) {
            System.out.println("Invalid unit! please check!");
        }
        // check if the units is more than 50 and less than eqaul to 150
        else if(units > 50 & units <= 150) {
            double bill = 0.75 * units;
            System.out.println("Units consumed: " + units + " units");
            System.out.println("Cost per unit: Rs.0.75");
            System.out.println("Your total bill is: Rs." + bill);
        }
        // check if the units is more than 150 less than eqaul to 250
        else if(units > 150 & units <= 250) {
            double bill = 1.20 * units;
            System.out.println("Units consumed: " + units + " units");
            System.out.println("Cost per unit: Rs.1.20");
            System.out.println("Your total bill is: Rs." + bill);
        }
        // check if the units is more than 250
        else {
            double bill = 1.50 * units;
            System.out.println("Units consumed: " + units + " units");
            System.out.println("Cost per unit: Rs.1.50");
            System.out.println("Your total bill is: Rs." + bill);
        }
        sc.close();
    }
}
