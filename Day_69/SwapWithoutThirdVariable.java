public class SwapWithoutThirdVariable {

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("after swapping new value of a = " + a);
        System.out.println("after swapping new value of b = " + b);
    }

    public static void main(String[] args) {
        // swap two variables
        int a = 5;
        int b = 10;

        System.out.println("initial value of a = " + a);
        System.out.println("initial value of b = " + b);

        swap(a, b);
    }
}
