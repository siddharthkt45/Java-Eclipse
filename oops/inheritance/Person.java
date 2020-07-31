package oops.inheritance;

public class Person {
	protected String name;
	
	public Person() {
		System.out.println("Inside Person constructor");
	}
	
	public void walk() {
		System.out.println(name + " is walking");
	}
	
	public void eat() {
		System.out.println(name + " is eating");
	}
}
