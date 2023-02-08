public class StringPalindrome {

    public static void main(String args[]) {
        String Word = "racecar";
        String reverseWord = "";
        for (int i = Word.length() - 1; i >= 0; i--) {
            reverseWord = reverseWord + Word.charAt(i);
        }
        System.out.println(reverseWord);
        if (Word.equals(reverseWord)) {
            System.out.println("It is a palindrome Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }
}
