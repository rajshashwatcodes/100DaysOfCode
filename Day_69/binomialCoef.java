package day38;
import java.util.*;

public class binomialCoef {

    public static int binoCoefficient(int n , int r) {
        int j = 1 , k = 1, l = 1;
            for(int i = n; i >= 1; i--) {
                j = j*i;
            }
            for(int i = r; i >= r; i--) {
                k = k * i;
            }
            for(int i = n-r ; i >= n-r; i--) {
                l = l * i;
            }
            // nCr = n!/(r! (n-r)!)
            int combination = j / ( k * l);
        return combination ;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value for r: ");
        int r = sc.nextInt();
        // Calling function
        int combination_value = binoCoefficient(n , r);
        sc.close();
        
        System.out.println("The Combination will be: " + combination_value);
        
        
    }
}
