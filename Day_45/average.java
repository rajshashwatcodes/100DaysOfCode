import java.util.*;

public class average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float x = sc.nextFloat();
        System.out.print("Enter the second number: ");
        float y = sc.nextFloat();
        System.out.print("Enter the third number: ");
        float z = sc.nextFloat();
        float avg = (x + y + z) / 3;
        System.out.println("The average of the three numbers are: " + avg);
        sc.close();
    }
}
