public class MethodOverloading2 {
    public static void main(String args[]) {
        Calculator calc = new Calculator();
        System.out.println(calc.Add(1 , 2));
        System.out.println(calc.Add(1.1f , 2.2f));
        System.out.println(calc.Add( 1 , 2 , 3));
    }
}

class Calculator {
    int Add(int a , int b) {
        return a + b;
    }

    float Add(float a , float b) {
        return a + b;
    }

    int Add(int a, int b, int c) {
        return a + b + c;
    }
}
