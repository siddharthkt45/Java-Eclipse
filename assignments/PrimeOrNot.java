package assignments;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check whether it is prime or not");
		int n = sc.nextInt();
		
		for(int i = 2; i * i < n; i++) {
			if(n % i == 0) {
				System.out.println("It is not a prime number...");
				break;
			}
			else {
				System.out.println("It is a prime number...");
				break;
			}
		}
		
	}
}
