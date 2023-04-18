public class ContinueStatement2 {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 10; i++) {
            // if the value of i is 4, the loop continues
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
