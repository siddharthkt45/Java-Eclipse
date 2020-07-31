package assignments;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number upto which you want the series sum");
		int n = sc.nextInt();
		float sum = 0.0f;
		
		for(int i = 1; i <= n; i++) {
			sum += (float) 1 / i;
		}
		System.out.println("The sum of the series is " + sum);
	}

}
