public class strings {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(toUpperCase(s));
    }

    public static String toUpperCase(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] -= 32;
        }
        return new String(chars);
    }
}
