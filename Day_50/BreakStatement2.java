public class BreakStatement2 {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 10; i++) {
            // if the value of i is 4, the loop terminates
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }
}
