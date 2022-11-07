public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "remuneration", s2 = "acquiesce";
		int n = 5, x = s1.length()+s2.length();
		char s1_arr [] = s1.toCharArray(), s2_arr [] = s2.toCharArray(), newarr[] = new char[x];
		for (int i = 0;i< n;i++) {
			newarr[i] = s1_arr[i];
		}
		for (int i = n;i< s2.length();i++) {
			newarr[i] = s2_arr[i];
		} 
		System.out.print(newarr);
	}

}
