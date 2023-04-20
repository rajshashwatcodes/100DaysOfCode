public class DoWhile2 {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
            i++;
        } while (i < 10);
    }
}
