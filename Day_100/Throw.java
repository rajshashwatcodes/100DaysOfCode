public class Throw {
//	two chances to deal with the same error 
//	chance 1: main() sets up an exception and calls throwProcess
//	chance 2: throwProcess() then sets up another exception
	static void throwProcess() { //handles context and immediately throws NullPointerException
		try {
			//new is used to construct an instance of NullPointerException
			throw new NullPointerException ("Understand throw in Java");
		}
		catch (NullPointerException ex) {
			System.out.println("Caught inside throwProcess");
			throw ex;
		}
	}

	public static void main(String[] args) {
		try {
			throwProcess();
		}
		catch(NullPointerException ex) {
			System.out.println("Recaught: " + ex);
		}

	}

}
