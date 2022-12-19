public class GetterSetter {
    public static void main(String args[]) {
        // creating a pen object p1
        Pen p1 = new Pen();
        // setting the pen color
        p1.setColor("Blue");
        System.out.println(p1.getColor()); //calling getter function
        // setting the pen's tip size
        p1.setTip(5);
        System.out.println(p1.getTipSize()); //calling getter function
    }
}
// creating class
class Pen {
    // defining properties
    private String color;
    private int tipSize;

    // getter
    String getColor() {
        return this.color; //'this' keyword used to find the actual object(property defined above)
    }
    // setter functions
    void setColor(String newColor) {
        color = newColor;
    }

    // getter
    int getTipSize() {
        return this.tipSize; //'this' keyword used to find the actual object(property defined above)
    }
    // setter function
    void setTip(int newTip) {
        tipSize = newTip;
    }
}
