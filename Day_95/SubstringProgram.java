import java.util.Scanner;

public class SubstringProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Input the substring to find
        System.out.print("Enter the substring to find: ");
        String subString = scanner.nextLine();

        // Check if the substring exists in the main string
        if (mainString.contains(subString)) {
            System.out.println("Substring found in the main string.");
        } else {
            System.out.println("Substring not found in the main string.");
        }

        scanner.close();
    }
}
