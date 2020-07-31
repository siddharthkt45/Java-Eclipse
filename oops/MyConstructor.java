package oops;

class Vehicle {
	int wheels;
	int headLights;
	String color;
	
	Vehicle() {
		
	}
	
	Vehicle(int wheels) {
		this.wheels = wheels;
		headLights = 2;
	}
	
	Vehicle(int wheels, String color) {    //Here, we used Constructor overloading
		this.wheels = wheels;
		this.color = color;
		headLights = 2;
	}
}
public class MyConstructor {
	
	MyConstructor() {
		System.out.println("Object is now created");
	}

	public static void main(String[] args) {
		MyConstructor obj = new MyConstructor();
		
		Vehicle car = new Vehicle(4);
//		car.wheels = 4;
		System.out.println(car.wheels + " wheels");
		
		Vehicle bike = new Vehicle(2);
		System.out.println(bike.wheels + " wheels");
		
		Vehicle eRickshaw = new Vehicle(3, "Yellow");
		System.out.println(eRickshaw.wheels + " wheels and " + eRickshaw.color + " color");
		
		Vehicle random = new Vehicle();
	}

}
