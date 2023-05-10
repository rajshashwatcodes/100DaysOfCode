public class Strings2 {
    public static void main(String[] args) {
        String character = "A";
        for(int i = 1 ; i <= 5 ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                System.out.print(character);
                character = nextCharacter(character);
            }
            System.out.println();
        }
    }
}
