package assignments;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first value: ");
		int firstValue = sc.nextInt();
		
		System.out.println("Enter your second value: ");
		int secondValue = sc.nextInt();
		
		System.out.println("Enter the type of operation: ");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
		double result = 0;
		
		switch(operation) {
		case '+':
			result = firstValue + secondValue;
			break;
		case '-':
			result = firstValue - secondValue;
			break;
		case '*':
			result = firstValue * secondValue;
			break;
		case '/':
			result = firstValue / secondValue;
			break;
		case '%':
			result = firstValue % secondValue;
			break;
			default:
				System.out.println("Invalid operation entered!!!");
		}
		System.out.println("Result is " + result);

	}

}
