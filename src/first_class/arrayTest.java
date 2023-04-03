package first_class;

import java.util.Scanner;

public class arrayTest {
	public static void main(String[] args) {
		int a[] = new int[5];
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 5;i++) {
			System.out.println("Enter your number:- ");
			a[i] = scanner.nextInt();
		}
		for(int j = 0; j < 5;j++) {
			sum = sum + a[j];
		}
		System.out.println("The sum of the values of the array is:- " + sum);
		
	}
}
