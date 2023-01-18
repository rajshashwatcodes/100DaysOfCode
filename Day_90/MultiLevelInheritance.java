public class MultiLevelInheritance {
    public static void main(String args[]) {

        // creating dog object
        Dogs Beagle = new Dogs();
        Beagle.skincolor();
        Beagle.legs = 4;
        System.out.println(Beagle.legs);
    }
}

// creating super class
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

// subclass derives super class Animals
class Mammals extends Animals {
    int legs;
}

// subclass derives previous subclass Mammals
class Dogs extends Mammals {
    int breed;
}
