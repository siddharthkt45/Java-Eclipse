package assignments;

import java.util.Scanner;

public class SeriesSum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number upto which you want the sum of the series");
		int n = sc.nextInt();
		float sum = 0.0f;
		
		for(float i = 1; i <= n; i++) {
			if(i % 2 == 0)
				sum -= 1/i;
			else
				sum += 1/i;
		}

		System.out.println("The sum of series is " + sum);
	}

}
