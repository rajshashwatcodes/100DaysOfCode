public class HybridInheritance {
    public static void main(String args[]) {

        // mammals object
        Mammals Cow = new Mammals();
        Cow.breathe();

        // dog object
        Dog Beagle = new Dog();
        Beagle.legs = 4;
        System.out.println(Beagle.legs);

        // fish object
        Fish Whale = new Fish();
        Whale.eat();

        Bird Pigeon = new Bird();
        Pigeon.skincolor();
        Pigeon.fly();
    }
}
    
class Animals {
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

class Mammals extends Animals {
int legs;

    void walk() {
        System.out.println("walks");
    }
}

// subclass of mammals
class Dog extends Mammals {
    void breed() {
        System.out.println("Breed");
    }
}

// subclass of mammals
class Elephant extends Mammals {
    void size() {
        System.out.println("Huge size");
    }
}

class Fish extends Animals {
    void swim() {
        System.out.println("Swims");
    }
}

// subclass of Fish
class Tuna extends Fish {
    int fins;

    void sleep() {
        System.out.println("Open eyes");
    }
}

class Bird extends Animals {
    void fly() {
        System.out.println("Flies");
    }
}

// subclass of Bird
class Kiwi extends Bird {
    void beak() {
        System.out.println("Small beak");
    }
}

