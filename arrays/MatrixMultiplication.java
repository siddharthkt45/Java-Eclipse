package arrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows in matrix1 ");
		int row1 = sc.nextInt();
		System.out.println("Enter the number of columns in matrix1 ");
		int col1 = sc.nextInt();
		int a[][] = new int[row1][col1];
		
		System.out.println("Enter the number of rows in matrix2 ");
		int row2 = sc.nextInt();
		System.out.println("Enter the number of columns in matrix2 ");
		int col2 = sc.nextInt();
		int b[][] = new int[row2][col2];
		
		int product[][] = new int[row1][col2];
		
		if(col1 == row2) {
			System.out.println("Enter value: Matrix 1: ");
			for(int i = 0; i < row1; i++) {
				for(int j = 0; j < col1; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Enter value: Matrix 2: ");
			for(int i = 0; i < row2; i++) {
				for(int j = 0; j < col2; j++) {
					b[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0; i < row1; i++) {
				for(int j = 0; j < col2; j++) {
					int m = 0;
					int n = 0;
					product[i][j] = a[i][m++] * b[n++][j] + a[i][m] * b[n][j]; 
					System.out.print(product[i][j] + " ");
				}
				System.out.println();
			}
		}

	}

}
