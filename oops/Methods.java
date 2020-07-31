package oops;

public class Methods {

	public static void main(String[] args) {
		
		int firstNumber = 34;
		int secondNumber = 23;
		sayHi();
		sayHi();
		int greater = maxOf(firstNumber, secondNumber);
		
		maxOf(2, 7);
		
		maxOf(76, 75);
		
		System.out.println(greater);
	}

	static int maxOf(int a, int b) {
//		if(a > b) {
//			return a;
//		}
//		else {
//			return b;
//		}
		
//		Alternative method
		
		return a > b ? a : b;
	}
	
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("Good morning");
	}
}






