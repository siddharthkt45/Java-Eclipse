package oops;

public class PassByValue {

	public static void main(String[] args) {
//		int c = 12;
//		int d = 23;
//		
//		swap(c, d);    //Pass-by-Value called
//		System.out.println(c + " " + d);
		
//		Dogs c = new Dogs();
//		c.legs = 3;
//		Dogs d = new Dogs();
//		d.legs = 4;
//		
//		swap(c, d);   //Pass-by-Reference called
//		
//		System.out.println(c.legs + " " + d.legs);
		
		Dogs a = new Dogs();
		a.legs = 4;
		
		changeDog(a);   //Pass-by-Reference called
		
		System.out.println(a.legs);   
	}
	
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		
	}
	
	static void swap(Dogs a, Dogs b) {
		Dogs temp = a;
		a = b;
		b = temp;
	}
	
	static void changeDog(Dogs dog) {
		dog.legs = 6;
	}
}

class Dogs {
	int legs;
}
