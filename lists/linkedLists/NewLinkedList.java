package lists.linkedLists;

public class NewLinkedList {

	public static void main(String[] args) {
		MyLinkedList<Integer> myLL = new MyLinkedList<>();
		
		for(int i = 0; i < 10; i++) {
			myLL.add(i);
		}
		
		myLL.print();

	}

}
