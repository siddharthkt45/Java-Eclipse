package oops.inheritance;

public class Teacher extends Person{
	
	public Teacher() {
		super();
		System.out.println("Inside teacher constructor");
	}
	
	public void teach() {
		System.out.println(name + " is teaching");
	}
	
	public void eat() {
		super.eat(); 	//It refers to the eat() method in its super class Person
		System.out.println("Teacher " + name + " is eating");
	}
}
