package assignments;

import java.util.Scanner;

public class ExponentWithoutMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int first = sc.nextInt();
		System.out.println("Enter raised to the power");
		int second = sc.nextInt();
		int temp = first;
		
		for(int i = 1; i < second; i++) {
			first *= temp;
		}
		
		System.out.println(temp + " raised to the power " + second + " is " + first);
		
//		Alternative method
//		int result = 1;
//		for(int i = 0; i < second; i++) {
//			result *= first;
//		}
//		System.out.println(result);
	}

}
