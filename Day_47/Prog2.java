public class Prog2 {
	public static void main(String args[]) {
		String s1 = "Shashwat",s = "shw";
		char ch = 't';
		int flag = 0;
		if (s1.contains(s)) {
			System.out.println("Sub-string Present");
		}
		else {
			System.out.println("Sub-string not Present");
		}
		char strarr[] = s1.toCharArray();
		
		for (int i = 0; i < s1.length();i++) {
			if (strarr[i] == ch) {
				System.out.print("Character is present & present at position: "+ i);
				flag = 1;
		}
	}
		if (flag!= 1) {
			System.out.print("Character is not present");
		}
	}
}
