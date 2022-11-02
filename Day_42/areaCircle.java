package day21;
import java.util.*;

public class areaCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius(in cm): ");
        double r = sc.nextDouble() , pi = 3.14 ;
        double area = pi * (r * r) ;
        System.out.println("The area of the circle is(sq cm): " + area);
        sc.close();
    }
}
