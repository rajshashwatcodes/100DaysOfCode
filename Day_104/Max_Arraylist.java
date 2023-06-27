import java.util.ArrayList;

public class Max_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(2);

        // print maximum of the list
        int max = list.get(0);
        for(int i = 1; i < list.size(); i++) {
            if(list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println(max);
    }
}
