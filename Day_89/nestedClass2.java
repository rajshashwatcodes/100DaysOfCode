public class nestedClass2 {
    public static void main(String[] args) {
        // creating an object of the outer class
        OuterClass obj = new OuterClass();
        // calling the display_Inner() method
        obj.display_Inner();
    }
}

// outer class
class OuterClass {
    // inner class
    private class InnerClass {
        public void my_Method() {
            System.out.println("This is an inner class.");
        }
    }
    // method to create instance of the inner class
    void display_Inner() {
        InnerClass inner = new InnerClass();
        inner.my_Method();
    }
}


