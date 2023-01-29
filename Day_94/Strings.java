import java.util.*;

public class Strings {
    public static void main(String args[]) {
        char arr[] = {'a', 'b', 'c', 'd'};
        // definig string
        String str = "abcd";
        String str2 = new String("xyz");
        System.out.println(str);
        System.out.println(str2);

        // String are IMMUTABLE 
        // strings can be used in input output
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String name = sc.nextLine();
        System.out.println(name);
        sc.close();
    }
}
