package oops.interfaces;

public class Person implements Student, Youtuber {
	
	public static void main(String[] args) {
		Person obj = new Person();
		obj.study();
		obj.makeVideo();
		obj.editVideo();
		
		Youtuber obj2 = obj;
		obj2.makeVideo();
		obj2.editVideo();

	}

	@Override
	public void makeVideo() {
		System.out.println("Person is making video");
	}

	@Override
	public void study() {
		System.out.println("Person is studying");
	}

	@Override
	public void editVideo() {
		System.out.println("Person is editing videos");
	}

}
