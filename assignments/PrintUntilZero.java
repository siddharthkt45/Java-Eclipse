package assignments;

import java.util.Scanner;

public class PrintUntilZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 1;
		
		do {
			n = sc.nextInt();
			System.out.println("Number is " + n);
		} while(n != 0);
		
		System.out.println("Out of the Loop");
	}

}
