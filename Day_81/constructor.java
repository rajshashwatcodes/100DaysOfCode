public class constructor {
    public static void main(String args[]) {
        Student s1 = new Student();
    }
}
class Student {
    String name;
    int roll;

    Student() {
        System.out.println("Constructor has been called...");
    }
}
