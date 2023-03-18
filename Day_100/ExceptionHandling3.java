public class ExceptionHandling3 {
    public static void main(String args[]) {
        
        // divide(4, 0);
    
        try {
            int a = 4 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception occured: " + e);
        } finally {
            System.out.println("Finally block is always executed.");
        }

    }

    public static void divide(int a, int b) {
        try {
            int c = a / b;
            System.out.println("Result is: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception occured: " + e);
        }
    }

    public static void divide2(int a, int b) {
        try {
            int c = a / b;
            System.out.println("Result is: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception occured: " + e);
        } finally {
            System.out.println("Finally block is always executed.");
        }
    }
}
