package day17;
import java.util.*;

public class votingAge {

   public static boolean elligibleAge(int age) {
       if(age > 18) {
           return true;
       }
       return false;
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your age(in years): ");
      int age = sc.nextInt();
      System.out.println(elligibleAge(age));
      sc.close();
   }   
}


