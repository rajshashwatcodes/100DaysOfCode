public class incrementUnary {
    public static void main(String args[]) {
        /*  pre decreament "++a" will first change the value of its own variable...here "a" 
         and then assign it to the other variable */
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        /* post decreament "a++" will first assign the value to the other variable 
        and then change it for its own variable...here "x"  */
        System.out.println("-------------------------------");
        int x = 20;
        int y = x++;
        System.out.println(x);
        System.out.println(y);

    }
    
}
