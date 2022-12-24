public class pyramid_0_1 {
    public static void main(String args[]) {
        int j = 5;
        for(int i = 1 ; i <= j ; i++) {
            for(int k = 1 ; k <= i ; k++) {
                if(k % 2 != 0) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
