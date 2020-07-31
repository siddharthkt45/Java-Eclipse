package oops;

class Cat {
	boolean hasFur;
	String color, breed;
	int legs, eyes;
	
	public void walk() {
		System.out.println("Cat is walking");
	}
	
	public void eat() {
		System.out.println("Cat is eating");
	}
	
	public void description() {
		System.out.println("My cat has " + legs + " and " + eyes + " eyes");
	}
}

class Dog {
	String name, breed;
	
	public void jump() {
		System.out.println("My dog " + name + " jumped!!!");
	}
	
	public void description() {
		System.out.println("My dog's name is " + name + " and its breed is " + breed);
	}
}

public class OopsConcepts {

	public static void main(String[] args) {
//		Cat cat1 = new Cat();
//		Cat cat2 = new Cat();
//		
//		cat1.legs = 4;
//		cat1.eyes = 2;
//		
//		cat1.description();
//		cat1.walk();
//		cat2.eat();
		
		Dog husky = new Dog();
		Dog labrador = new Dog();
		
		husky.breed = "Husky";
		husky.name = "Tiger";
		
		labrador.breed = "Labrador";
		labrador.name = "Mr. Moolchand Ji";
		
		husky.jump();
		husky.description();
		
		labrador.jump();
		labrador.description();
				
	}

}
