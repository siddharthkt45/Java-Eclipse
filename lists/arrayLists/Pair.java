package lists.arrayLists;

public class Pair<X, Y> {	//We have defined a Generic class here

	X x;	//User-defined datatypes
	Y y;	//User-defined datatypes
	
	public Pair(X x, Y y) { //This is a bloody Constructor
		this.x = x;
		this.y = y;
	}
	
	public void getDescription() {
		System.out.println(x + " " + y);
	}
}
