package assignments;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		
		while(temp > 0) {
			int remainder = temp % 10;
			sum = sum + remainder;
			temp /= 10;
			
			System.out.println(remainder + " " + temp + " " + sum);
		}
		
		System.out.println("Sum of digits of " + n + " is " + sum);
	}

}
