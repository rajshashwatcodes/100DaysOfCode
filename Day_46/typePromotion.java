public class typePromotion {
    public static void main(String args[]) {
        byte a = 5;
        short b = 7;
        char c = 'p';
        // these will be converted to type int when they would be used in any expression
        System.out.println(a + b + c);
        System.out.println("---------------------------------");
        
        int p = 12;
        float q = 12.26f;
        long r = 3;
        double s= 25;
        // since here the type double has the greatest value...all the other types will be converted to type double.
        System.out.println(p + q + r + s);
    }
}
