public class Recursive_func2 {

    // Recursive function to compute the factorial of a number
    public static int factorial(int n) {
        if (n <= 1) {
            return 1; // Base case: factorial of 0 and 1 is 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        int num = 5;
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
