public class logicalOperators {
    public static void main(String args[]) {
        // and opertor "&&"
        // both the conditions should be true to get a true output
        System.out.println((2 > 3) && (3 < 5));
        System.out.println("------------");
        System.out.println((2 < 3) && (3 < 5));

        System.out.println("=============");
        
        // or opertor "||"
        // any one of the two conditions should be true to get a true output
        System.out.println((2 > 3) || (3 < 5));
        System.out.println("------------");
        System.out.println((2 > 3) || (3 > 5));

        System.out.println("=============");
        
        // not opertor "!"
        // returns true if the statement is false and vice versa
        System.out.println(!(3 < 5));
        System.out.println("------------");
        System.out.println(!(2 > 3));
    }
}
