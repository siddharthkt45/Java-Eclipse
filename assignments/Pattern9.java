package assignments;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			if(i <= (n+1)/2) {
				for(int j = 1; j<=i; j++) {
					System.out.print("* ");
				}
			}
			else {
				for(int j = 1; j<=n-i+1; j++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

}
