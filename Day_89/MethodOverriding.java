class Shape {
    void draw() {
        System.out.println("Drawing Shapes...");
    }
}

class Square extends Shape { //Inheritance of base class
    // Overriding method of base class with different implementation
    void draw() {
        System.out.println("Drawing Square...");
    }
}

class Circle extends Shape { //Inheritance of base class
    // Overriding method of base class with different implementation
    void draw() {
        System.out.println("Drawing Circle...");
    }
}

class Triangle extends Shape { //Inheritance of base class
    // Overriding method of base class with different implementation
    void draw() {
        System.out.println("Drawing Triangle...");
    }
}

public class MethodOverriding {
    public static void main(String args[]) {

        // creating object of base class Shape
        Shape obj;
        obj = new Shape();
        obj.draw();

        // initiating objects with child classes
        obj = new Square();
        obj.draw();

        obj = new Circle();
        obj.draw();

        obj = new Triangle();
        obj.draw();
    }
    
}

