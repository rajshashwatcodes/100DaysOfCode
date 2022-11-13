import java.util.*;

public class weekday {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day number(1-7): ");
        int day = sc.nextInt();
        // switch statements
        switch(day) {
            case 1 : System.out.println("Sunday");
                        break;
            case 2 : System.out.println("Monday");
                        break;
            case 3 : System.out.println("Tuesday");
                        break;
            case 4 : System.out.println("Wednesday");
                        break;
            case 5 : System.out.println("Thursday");
                        break;
            case 6 : System.out.println("Friday");
                        break;
            case 7 : System.out.println("Saturday");
                        break;
            default : System.out.println("A week has only 7 days which is 1 to 7!");
            sc.close();
        }
    }
}
