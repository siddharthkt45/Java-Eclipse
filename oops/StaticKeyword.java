package oops;

import oops.A.B;
import oops.A.C;

public class StaticKeyword {
	
	static {
		System.out.println("Inside block 1");
	}
	
	static {
		System.out.println("Inside block 2");
	}

	public static void main(String[] args) {
		
		System.out.println("Inside main");
		
		A objA = new A();
		A.B objB = objA.new B(); //Or we can import the A class along with B

		C objC = new A.C();
	}

	static {
		System.out.println("Inside block 3");
	}
}
