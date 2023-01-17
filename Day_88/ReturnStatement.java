public class ReturnStatement {
    public static void main(String args[]) {
        ReturnStatement r = new ReturnStatement();
        int sum = r.addition(10, 20); //addition() method is called
        System.out.println("Sum = " + sum);
    }
    int addition(int a , int b) {
        int sum = a + b;
        return sum;
    }
}
