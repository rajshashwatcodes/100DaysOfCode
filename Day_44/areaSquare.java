import java.util.*;

public class areaSquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter measurement of the side(in cm): ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("The area of the square is: " + area + " sq cm");
        sc.close();
    }
}
