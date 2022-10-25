import java.util.*;

public class greater_number {

    public static int greaterValue(int x , int y) {
        if(x > y) {
            return x;
        }
        else {
            return y;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value 'x': ");
        int x = sc.nextInt();
        System.out.print("Enter another value 'y': ");
        int y = sc.nextInt();
        System.out.println("The greater value is " + greaterValue(x , y));
        sc.close();
    }
}
