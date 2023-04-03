package first_class;

import java.util.Scanner;
import java.util.scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter you number:- ");
		int a,b,c;
		try {
			a = scanner.nextInt();
			b = scanner.nextInt();
			
		c = a/b;
		System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Please input real numbers!");
		}
	}
}
