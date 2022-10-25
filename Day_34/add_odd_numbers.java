package day16;
import java.util.*;

public class addOddNos {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the max limit: ");
        
        int j = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= j ; i = i + 2) {
            sum = sum + i ;
        }
        System.out.println(sum);
        sc.close();
    }
}
