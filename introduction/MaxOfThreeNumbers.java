package introduction;

public class MaxOfThreeNumbers {

	public static void main(String[] args) {
		int a = 12, b = 10, c = 18;
		int maxOfThreeNumbers = 0;
		
		if (a > b) {
			if (b > c) {
				maxOfThreeNumbers = a;
			}
			else {
				maxOfThreeNumbers = c;
			}
		}
		else {
			if (a > c) {
				maxOfThreeNumbers = b;
			}
			else {
				maxOfThreeNumbers = c;
			}
		}
//		int maxOfThreeNumbers = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
		
		System.out.println("Max of all numbers is " + maxOfThreeNumbers);
	}

}
