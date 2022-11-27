import java.util.*;

public class doWhile3 {
    public static void main(String args[]) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the end of the series: ");
        int j = sc.nextInt();
        do {
            System.out.println("I am Learning Java!");
            i++;
        }
        while(i <= j);
        System.out.println("'I am Learning Java!' printed" + j + "times");
        sc.close();
    }
}
