package oops.exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		
		try {
			int c = a/b;
			System.out.println(c);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage() + " occured, please check your code.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage() + " occured, please check your code.");
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage() + " occured, please check your code.");
		} finally {
			System.out.println("Sorry for the incovenience");
		}
	
		System.out.println("Very important code");
		System.out.println("Need to run");
		
//		fun1();
	
	}
	
	static void fun1() {
		int a = 5;
		int b = 0;
		int c = a/b;
		System.out.println(c);
	}
}
