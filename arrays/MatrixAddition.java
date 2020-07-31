package arrays;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows you want");
		int i = sc.nextInt();
		System.out.println("Enter the number of columns you want");
		int j = sc.nextInt();
		
		int a[][] = new int[i][j];
		int b[][] = new int[i][j];
		int sum[][] = new int[i][j];
		
		for(int k = 0; k < i; k++) {
			for(int l = 0; l < j; l++) {
				System.out.println("Enter value: Array1: row " + k + " and column " + l);
				a[k][l] = sc.nextInt();
			}
		}
		
		for(int k = 0; k < i; k++) {
			for(int l = 0; l < j; l++) {
				System.out.println("Enter value: Array2: row " + k + " and column " + l);
				b[k][l] = sc.nextInt();
			}
		}
		
		for(int k = 0; k < i; k++) {
			for(int l = 0; l < j; l++) {
				sum[k][l] = a[k][l] + b[k][l];
				System.out.print(sum[k][l] + "  ");
			}
			System.out.println();
		}
	}
}
