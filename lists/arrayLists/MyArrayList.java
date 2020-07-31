package lists.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList();	//We should always try to define the object of List type
		
		fruits.add("Apple");
		fruits.add("Orange");
		
		double x = 45.0;
		
		System.out.println(fruits);
		
		ArrayList<Integer> marks = new ArrayList();
		
		Pair<String, Integer> p1 = new Pair("Rohit", 45); //This is a Generic Class
		Pair<Boolean, String> p2 = new Pair(true, "Sid"); //This is a Generic class
		
		p1.getDescription();
		p2.getDescription();

	}

}
