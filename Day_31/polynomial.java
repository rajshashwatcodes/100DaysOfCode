package Sep27;
import java.util.*;

public class polynomial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int a[] = new int[n+1];
		int b[] = new int[n+1];
		System.out.println("Enter Elements of 1st Array: ");
		for (int i = 0; i< n+1; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter Elements of 2st Array: ");
		int sum[] = new int[n+1];
		for (int i = 0; i< n+1; i++) {
			b[i] = sc.nextInt();
		}
		for (int i = n; i>= 0; i--) { 
			sum[i] = a[i]+b[i];
			if (i != 0) {
				System.out.print(sum[i]+"X^"+i+"+");
			}
			else {
				System.out.print(sum[i]);
			}
		}

	}

}
