public class MethodOverloading {
    public static void main(String args[]) {
        int a = 25;
        int b = 17;
        double c = 54.5;
        double d = 32.3;
        int result1 = minFunction(a , b);

        // same function name with different parameters
        double result2 = minFunction(c , d);
        System.out.println("The minimum value of integer types is: " + result1);
        System.out.println("The minimum value of double types is: " + result2);
    }

    // function for integer type
    public static int minFunction(int n1 , int n2) {
        int min;
        if(n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }

    // function for double type
    public static double minFunction(double n1, double n2) {
        double min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }



}
