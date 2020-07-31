package assignments;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of terms you want in fibonacci series");
		int n = sc.nextInt();
		int fibo1 = 0;
		int fibo2 = 1;
		int series = 0;
		System.out.print(fibo1 + " " + fibo2 + " ");
		for(int i = 0; i < n-2; i++) {
			series = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = series;
			System.out.print(series + " ");
		}

	}

}
