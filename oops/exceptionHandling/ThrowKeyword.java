package oops.exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		fun1();

	}
	
	static void fun1() {
		int a = 5;
		int b = 3;
		
		int c = a/b;
		System.out.println(c);
		
		try {
			fun2();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage() + ", please check your code.");
		}
		
	}
	
	static void fun2() throws ArrayIndexOutOfBoundsException{
		boolean isDanger = true;
		if(isDanger == true) {
			throw new ArrayIndexOutOfBoundsException("I'm smelling Danger");
		}
	}
}

	
