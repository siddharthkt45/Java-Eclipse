package arrays;

import java.util.Scanner;

public class AverageMarksOfStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		
		int[] marks = new int[n];
		
		for(int i = 0; i<n; i++) {
			System.out.println("Enter the marks of Student" + (i+1));
			marks[i] = sc.nextInt();
		}
		
		double avgOfMarks = 0.0;
		for(int i = 0; i<n; i++) {
			avgOfMarks += marks[i];
		}
		
		avgOfMarks /= n;
		System.out.println("Average marks of the students is: " + avgOfMarks);

	}

}
