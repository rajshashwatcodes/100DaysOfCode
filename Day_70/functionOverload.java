public class funcOverload {
// function overloading based on parameters
    public static int sum(int a , int b) {
        return a + b;
    }
// parameters should be different, same name can be used for all function overloading
    public static int sum(int a , int b , int c) {
        return a + b + c;
    }
    public static void main(String args[]) {
        // no matter which function is called first
        // it all depends on the parameters we define
        System.out.println(sum(12 , 26 , 6));
        System.out.println(sum(12 , 26));
    }
}
