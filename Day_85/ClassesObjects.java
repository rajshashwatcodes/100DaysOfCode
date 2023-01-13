class Box {
    double width;
    double height;
    double length;

    // display volume of a box(method)

    double volume() {
        System.out.print("Volume is: ");
        System.out.print(width * height * length);
    }
}

public class ClassesObjects {
    public static void main(String args[]) {
        // create two box objects
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        // assign values to mybox1's instance variables

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.length = 15;

        double volume1 = mybox1.volume();

        // assign values to mybox1's instance variables

        mybox2.width = 3;
        mybox2.height = 9;
        mybox2.length = 6;

        double volume2 = mybox2.volume();

        System.out.println(volume1);
        System.out.println(volume2);

    }
}
