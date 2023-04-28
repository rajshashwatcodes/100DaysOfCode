// To print:

// A
// BC
// DEF
// GHIJ
// KLMNO

public class CharacterPattern {
    public static void main(String args[]) {
        char character = 'A';
        for(int i = 1 ; i <= 5 ; i++) {
            for(char j = 1 ; j <= i ; j++) {
                System.out.print(character);
                character++;
            }
            System.out.println();
        }
    }
}
