public class MethodOverriding2 {
    public static void main(String args[]) {

        // creating deer object
        Deer d = new Deer();
        d.eat();

        // creating rat object
        Rat r = new Rat();
        r.eat();
    } 

}

// creating base/parent class
class Animal {
    void eat() {
        System.out.println("Eats anything...");
    }
}

// creating sub/child class
class Deer extends Animal {
    void eat() {
        System.out.println("Eats grasses...");
    }
}

// creating sub/child class
class Rat extends Animal {
    void eat() {
        System.out.println("Eats cheese...");
    }
}

