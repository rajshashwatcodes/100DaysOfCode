public class GetCharsMethod {
    public static void main(String args[]) {
        String s = "This is a demo of the getChars method.";
        // start index
        int start  = 10;
        //  end index
        int end = 14;
        // targeted char array
        char buf[] = new char[end - start];
        // copy the targeted char array to buf array by using getChars method
        //  void getChars(intSourceStart , int SourceEnd , charTarget[] , int targetStart)      
        s.getChars(start , end , buf , 0);
        System.out.println(buf);
        
    }
}
