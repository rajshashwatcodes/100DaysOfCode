import java.util.Scanner;

public class LargestString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables to store the largest string
        String largestString = "";
        int largestLength = 0;

        // Input the number of strings to compare
        System.out.print("Enter the number of strings to compare: ");
        int numStrings = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Input the strings and find the largest one
        for (int i = 0; i < numStrings; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            String inputString = scanner.nextLine();

            if (inputString.length() > largestLength) {
                largestString = inputString;
                largestLength = inputString.length();
            }
        }

        // Print the largest string
        if (largestString.isEmpty()) {
            System.out.println("No strings were entered.");
        } else {
            System.out.println("The largest string is: " + largestString);
        }

        scanner.close();
    }
}
