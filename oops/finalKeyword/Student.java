package oops.finalKeyword;

public final class Student {
	
//	final int rollNo;
//	final String name;
//	
//	{
//		rollNo = 4;
//	}
//	
//	public Student() {
//		name = "Sid";
//	}
	
	int rollNo;
	String name;
	
	public final void getDescription() {
		System.out.println("The student name is " + name);
	}

}
