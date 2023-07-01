import java.util.Stack;

public class TagValidator {
    public static boolean isValidTag(String tag) {
        Stack<Character> stack = new Stack<>();

        for (char ch : tag.toCharArray()) {
            if (ch == '<') {
                stack.push(ch);
            } else if (ch == '>') {
                if (stack.isEmpty() || stack.peek() != '<') {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] tags = {"<abc>", "<<abc>", "<aa><bb>", "<<zz>>", "<xx>>", "<<yy", "<bb><cc>>>"};

        for (String tag : tags) {
            if (isValidTag(tag)) {
                System.out.println(tag + " is a valid tag.");
            } else {
                System.out.println(tag + " is an invalid tag.");
            }
        }
    }
}

