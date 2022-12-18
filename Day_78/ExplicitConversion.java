public class ExplicitConversion {
    public static void main(String args[]) {
        byte x;
        int a = 200;
        double b = 100.034;
        System.out.println("integer type converted to byte type");
        x = (byte)a;
        System.out.println("a and x " + a + " = " + x);
        System.out.println("double type converted to integer type");
        a = (int)b;
        System.out.println("b and a " + b + " = " + a);
    }
}
