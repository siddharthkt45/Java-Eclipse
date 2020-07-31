package introduction;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int principle = sc.nextInt();
		float rateOfInterest = sc.nextFloat();
		int timeInYears = sc.nextInt();
		
		double simpleInterest = (principle * rateOfInterest * timeInYears) / 100;
		System.out.println("The simple interest is:- " + simpleInterest);
	}

}
