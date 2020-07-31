package queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainClass {

	public static void main(String[] args) {
		
//		Queue<Integer> q = new LinkedList<>();
		
//		System.out.println(q.poll());
//		q.remove();
		
//		q.add(12);
//		q.add(34);
//		q.add(56);
//		
//		System.out.println(q);
//		
//		System.out.println(q.remove());
//		System.out.println(q.remove());
//		
//		System.out.println(q.element());
		
		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(23);
		mq.enqueue(12);
		mq.enqueue(56);
		
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		
		mq.enqueue(345);
		
		System.out.println(mq.dequeue());
		System.out.println(mq.peek());
	}

}
