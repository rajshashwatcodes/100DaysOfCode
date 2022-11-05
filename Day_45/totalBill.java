import java.util.*;

public class totalBill {
    public static void main(String args[]) {
        System.out.println("To calculate your total bill:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter the pencil price: ");
        Double pencil = sc.nextDouble();
        System.out.print("Enter the pen price: ");
        Double pen = sc.nextDouble();
        System.out.print("Enter the eraser price: ");
        Double eraser = sc.nextDouble();
        System.out.println(name);
        // provisional bill without calculating gst
        Double proBill = pencil + pen + eraser;
        System.out.println("Your bill: Rs." + proBill);
        // total bill with gst
        System.out.println("GST = 18%");
        Double gst = 0.18 * proBill;
        System.out.println("Added 18% GST: Rs." + gst);
        Double totalBill = proBill + gst;
        System.out.println("Your total bill with GST is: Rs." + totalBill);
        sc.close();
    }
}
