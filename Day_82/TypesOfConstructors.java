public class TypesOfConstructors {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Amisha");
        Student s3 = new Student(139);
    }
}

class Student {
    String name;
    int roll;

    // non-parameterised constructor
    Student() {
        System.out.println("Constructor is called....");
    }

    // parameterised constructor
    Student(String name) {
        this.name = name;
    }  
    
    Student(int roll) {
        this.roll = roll;
    }
}
