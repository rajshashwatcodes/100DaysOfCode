import java.util.*;
 
public class circumference {
    public static Double getCircumference(Double radius) {
        return 2 * 3.14 * radius;
    }
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the length of radius in cm: ");
       Double r = sc.nextDouble();
       System.out.println(getCircumference(radius));
    }   
}
