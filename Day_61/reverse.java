package day33;

public class reverse {
    public static void main(String args[]) {
        int n = 122603;
        while(n > 0) {
            // to find the last digit and divide by 10
            System.out.print(n % 10);
            n = n / 10;
        }
    }
}
