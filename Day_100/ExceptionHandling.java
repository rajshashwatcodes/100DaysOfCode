public class ExceptionHandling {

	public static void main(String[] args) {
		int d,a;
		try {
			d = 0;
			a = 42/d;
			System.out.println("This will not be printed");
		}
		catch(ArithmeticException ex) {
			System.out.println("Exception thrown : " + ex);
		}
		System.out.println("After catch statement");
	}

}
