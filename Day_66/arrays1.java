import java.util.*;

public class arrays1 {
    public static void main(String args[]) {
        int marks[] = new int[1000];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        marks[0] = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        marks[1] = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        marks[2] = sc.nextInt();

        // To check if the marks are placed for correct subjects
        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);

        // To update maths marks
        marks[2] = 100;
        System.out.println("Maths(updated): " + marks[2]);

        sc.close();
    }
}
