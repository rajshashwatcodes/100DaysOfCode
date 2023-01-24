public class MethodLocalInnerClass {
    public static void main(String args[]) {
        OuterA outer = new OuterA();
        outer.test();
    }
}

class OuterA {
    int outer_x = 50 ; 
    void test() {
        class InnerB {
            void display() {
                System.out.println("display: outer_x = " + outer_x);
            }
        }
        for(int i = 0; i < 5; i++) {
            InnerB inner = new InnerB();
            inner.display();
        }
        
    }
}
