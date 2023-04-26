public class LinearStringSearch {
    public static void main(String[] args) {
        String arrayMenu[] = {"Appam" , "Dosa" , "Idli" , "Uttapam" , "Vada"};
        String item = "Appam";
        String index = StringLinearSearchFunc(arrayMenu , item);
        if(index == "Not Found") {
            System.out.println("Item not in menu");
        }
        else {
            System.out.println("The item is in index: " + index);
        }
        
    }

    public static String StringLinearSearchFunc(String arrayMenu[] , String item) {
        for(int i = 0 ; i < arrayMenu.length ; i++) {
            if(arrayMenu[i] == item) {
                String s = Integer.toString(i);
                return s;
            }
        }
        return "Not Found";
    }
}
