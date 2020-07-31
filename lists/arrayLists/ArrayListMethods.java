package lists.arrayLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList();	//We should always try to define the object of List type
		List<String> vegetables = new LinkedList();
		
//		adds an element to the List
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		
//		returns the size of the List as an int		
		System.out.println(fruits.size());
		
//		adds an element to the List
		
		vegetables.add("Tomato");
		vegetables.add("Potato");
		vegetables.add("Spinach");
		
//		returns the size of the List as an int
		System.out.println(fruits.size());
		
//		adds a whole collection (or List to be specific) to another collection (or List)
		fruits.addAll(vegetables);
		
//		returns the element at the specific index in the List
		System.out.println(fruits.get(3));
		
//		used to set/replace an element at a particular index in the List
		fruits.set(1, "Peach");
		
//		used to remove an element at a particular index from the List
		fruits.remove(5);
		
//		used to remove all the elements from the List
//		fruits.clear();
		
//		removes a whole collection from another collection
		fruits.removeAll(vegetables);
		
		System.out.println(fruits);
		
//		checks whether the given value is present in the List and returns a boolean value
		System.out.println(fruits.contains("Peach"));
		
//		checks whether the List is Empty and returns a boolean value
		System.out.println(fruits.isEmpty());
		
//		used to convert the List into an Array of type Object
		Object[] temp = fruits.toArray();
		
		for(Object e: temp) { 		//for-each loop can be used in Lists also
			System.out.println(e);
		}
		
		String temp1[] = new String[fruits.size()];
		
//		used to convert the List into an Array of specific type which you want 
		fruits.toArray(temp1);
		
		for(String e: temp1) {
			System.out.println(e);
		}

	}

}
