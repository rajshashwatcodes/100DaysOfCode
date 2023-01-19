class A {
     A() { // name should be same as class name
         System.out.println("Inside A's constructor");
     }
 }

 class B extends A {
     B() { // name should be same as class name
         System.out.println("Inside B's constructor");
     }
 }

 class C extends B {
     C() { // name should be same as class name
         System.out.println("Inside C's constructor");
     }
 }

public class MultiLevelInheritance2 {
    public static void main(String args[]) {
        C c = new C();
    }
}

// Output: 
// Inside A's constructor
// Inside B's constructor
// Inside C's constructor
