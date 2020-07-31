package assignments;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
//		int numberOfDigits = (int) Math.log10(n) + 1;
		
		while(temp > 0) {
			int remainder = temp % 10;
			sum = sum * 10 + remainder;
//			Alternate method
//			sum = sum + remainder * (int) Math.pow(10, numberOfDigits-1);
//			numberOfDigits--;
			temp /= 10;
		}
		if (sum == n) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}

}
