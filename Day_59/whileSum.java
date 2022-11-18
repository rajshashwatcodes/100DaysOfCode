import java.util.*;

public class whileSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= n) {
            sum = sum + i;
            i++;
            sc.close();
        }
        System.out.println("The sum is: " + sum);
    }
}
