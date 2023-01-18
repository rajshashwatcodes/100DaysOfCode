public class HierarchicalInheritance {
    public static void main(String args[]) {

        // mammals object
        Mammals Cow = new Mammals();
        Cow.breathe();

        // fish object
        Fish Tuna = new Fish();
        Tuna.eat();

        Bird Kiwi = new Bird();
        Kiwi.skincolor();
        Kiwi.fly();
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
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animals {
    void swim() {
        System.out.println("Swims");
    }
}

class Bird extends Animals {
    void fly() {
        System.out.println("Flies");
    }
}
