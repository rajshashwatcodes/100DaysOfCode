public class Inheritance {
    public static void main(String args[]) {
        // creating fish object
        Fish dolphin = new Fish();
        dolphin.eat();
    }
}

class Animals {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }

    void skincolor() {
        System.out.println("Natural");
    }
}

class Fish extends Animals {
    int fins;

    void swim() {
        System.out.println("Swims in water");
    }
}
