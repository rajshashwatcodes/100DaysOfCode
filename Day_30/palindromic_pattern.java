package day11;

// To create the following pattern

//     1
//    212
//   32123
//  4321234
// 543212345

public class pelindromic_pattern {
    public static void main(String args[]) {
        int n = 5;
        for(int i = 1 ; i <= n ; i++) {

            // spaces
            for(int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }

            // 1st half numbers
            for(int k = i ; k >= 1 ; k--) {
                System.out.print(k);
            }

            // 2nd half
            for(int p = 2 ; p <= i ; p++) {
                System.out.print(p);
            }
            System.out.println();
        }   
    }
}
