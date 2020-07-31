package oops.inheritance;

public class Singer extends Person{
	
	public Singer() {
		super();
		System.out.println("Inside Singer constructor");
	}
	public void sing() {
		System.out.println(name + " is singing");
	}
	
	public void eat() {
		System.out.println("Singer " + name + " is eating");
	}
}
