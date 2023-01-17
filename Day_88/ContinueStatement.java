public class ContinueStatement {
    public static void main(String args[]) {
        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                continue; //skips numbers divisible by 2
            }
            System.out.println(i);
        }
        System.out.println("outside of for loop");
    }
}
