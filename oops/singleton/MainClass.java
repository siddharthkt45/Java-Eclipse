package oops.singleton;

public class MainClass {

	public static void main(String[] args) {
		AppConfig obj1 = AppConfig.getInstance();	//the same object(obj) is accessed
		AppConfig obj2 = AppConfig.getInstance();	//the same object(obj) is accessed
		AppConfig obj3 = AppConfig.getInstance();	//the same object(obj) is accessed
		
//		Now we can create as many objects in this class, but in the AppConfig class, only one object is 
//		required and only one object is accessed
	}

}
