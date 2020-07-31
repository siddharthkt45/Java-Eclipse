package oops.finalKeyword;

public class MainClass{
	final int ROLL_NO = 4; //It is nececssary to initialize a final variable declared inside the class
																	// and not the method
	
	public static void main(String[] args) {
//		String name = "Anuj";
//		name = "Sid";

		final String NAME = "Sid";
//		name = "Anuj"; This line will throw an error
		
		final Student obj = new Student();
		Student obj2 = new Student();
		
//		obj = obj2;	We can't do this because final keyword here is assigned to the reference of object1
		
		obj.name = "Sid"; // But we can do this because the final keyword is not implied on the variable
	}

}
