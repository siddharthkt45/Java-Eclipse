package lists.vectorAndStacks;

import lists.linkedLists.MyLinkedList;

public class MyStack<E> {
	
	public MyLinkedList<E> ll = new MyLinkedList<>();
	
	public void push(E e) {
		ll.add(e);
	}
	
	public E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Popping from empty stack is not allowed");
		}
		return ll.removeLast();
	}
	
	public E peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Peeking in empty stack is not allowed");
		}
		return ll.getLast();
	}
}
