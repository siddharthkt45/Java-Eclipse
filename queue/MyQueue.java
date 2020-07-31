package queue;

import lists.linkedLists.MyLinkedList.Node;

public class MyQueue<E> {
	
	private Node<E> head, rear;
	
	public void enqueue(E e) {
		
		Node<E> toAdd = new Node<>(e);
		
		if(head == null) {
			head = rear = toAdd;
			return;
		}
		
		rear.next = toAdd;
		rear = rear.next;
		
	}
	
	public E dequeue() {
		
		if(head == null) {
			return null;
		}
		
		Node<E> toRemove = head;
		
		head = head.next;
		
		if(head == null) {
			rear = null;
		}
		
		return toRemove.data;
	}
	
	public E peek() {
		if(head == null) {
			return null;
		}
		
		return head.data;
	}
}
