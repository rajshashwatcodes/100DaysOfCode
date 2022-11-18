import java.util.*;

public class while1ton {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last number: ");
        int n = sc.nextInt();
        int a = 1;
        while(a <= n) {
            System.out.print(a + " ");
            a++;
        }
        sc.close();
    }
}
