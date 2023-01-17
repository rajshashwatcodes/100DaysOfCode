public class CompareToFunc {
    public static void main(String args[]) {
        String s1="abc";

        String s2= "abcef";

        // compares the ascii value of the first character of the string to the other string
        // if the ascii value of the first character of the string is greater than the other string, it returns a positive number or else it returns a negative number
        // if the ascii value of the first character of the string is equal to the other string, it returns 0
        System.out.println(s1.compareTo(s2)); 
    }
}
