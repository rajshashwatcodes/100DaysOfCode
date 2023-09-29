import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int characterCount = countCharacters(inputString);

        System.out.println("Number of characters: " + characterCount);

        scanner.close();
    }

    public static int countCharacters(String str) {
        return str.length();
    }
}
