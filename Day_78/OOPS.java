public class OOPS {
    public static void main(String args[]) {
        // creating a pen object p1
        Pen p1 = new Pen();
        // setting the pen color
        p1.setColor("Blue");
        System.out.println(p1.color);
        // setting the pen's tip size
        p1.setTip(5);
        System.out.println(p1.tipSize);
    }
}
// creating class
class Pen {
    // defining properties
    String color;
    int tipSize;

    // functions
    void setColor(String newColor) {
        color = newColor;
    }
    void setTip(int newTip) {
        tipSize = newTip;
    }
}
