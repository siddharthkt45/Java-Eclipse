package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
//		Run-time Polymorphism
		
		Dog d = new Dog();
		
		Pet p = d;
		Animal a = d;
		
		d.walk();
		p.walk();	//This will also call the walk() method in Dog class because the object is of Dog class

		System.out.println(d.name);		//This means that the variable "name" is not overridden, 
		System.out.println(p.name);		//it is only hidden
		
		System.out.println();
//		Compile-time Polymorphism
		
		greetings();
		greetings("Good Morning!!!");
		greetings("Sweet Morning!!!", 4);
		
	}

	public static void greetings() {
		System.out.println("Hi, there!!");
	}
	
	public static void greetings(String s) {
		System.out.println(s);
	}
	
	public static void greetings(String s, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(s);
		}
	}
}
