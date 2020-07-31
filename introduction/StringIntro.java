package introduction;

public class StringIntro {

	public static void main(String[] args) {
		String name = "Sid"; //Declaration through LITERALS
		String lastName = new String("Tiwari");
		String name2 = new String("Sid");
		
		//charAt() function
		System.out.println(lastName.charAt(3));
		
		//length() function
		System.out.println(name.length());
		
		//two types of substring() function
		System.out.println(lastName.substring(2));
		System.out.println(lastName.substring(0,  3));
		
		//contains() function
		System.out.println(lastName.contains("war"));
		
		System.out.println(name == name2); 
		//since name is created in String Pool Area and name2 is created in Heap Area
		//it returns false because their memory location is not the same
		
		System.out.println(name.equals(name2));
		//it returns true because it checks the strings and not their memory location
		
		//isEmpty() function
		String random = "";
		System.out.println(random.isEmpty());
		
		//replace() function
		System.out.println(lastName.replace('i', 'y'));
		System.out.println();
		
		//this is for split function
		String cars = "Ferrari,Maruti,Suzuki,Hyundai,Honda,Lamborghini,Rolls Royce";
		String allcars[] = cars.split(",");
		
		for(String car: allcars) {
			System.out.println(car);
		}
		//till here
		
		System.out.println();
		
		//toLowerCase() function
		String upper = "SID";
		System.out.println(upper.toLowerCase());
		
		//toUpperCase() function
		String lower = "tiwari";
		System.out.println(lower.toUpperCase());
		
		//trim() function
		String unordered = "       Sid Tiwari      ";
		System.out.println(unordered.trim());
	}

}
