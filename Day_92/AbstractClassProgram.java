public class AbstractClassProgram {
    public static void main(String[] args) {  
        // creating an object of the abstract class
        // we will be able to create an object of the abstract class
        // only if we extend it with a non-abstract class
        AbstractClass obj = new Abstract();  
        obj.display();  
    }
}

// absract class
abstract class AbstractClass {
    // abstract method
    public abstract void display();
}

// extending the abstract class
class Abstract extends AbstractClass {
    // implementing the abstract method
    public void display() {
        System.out.println("This is an abstract class.");
    }
}
