package deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
		
//		ArrayDeque<Integer> ad = new ArrayDeque<>();
//		ad.addFirst(23);
//		ad.addFirst(34);
//		
//		ad.pop();
//		System.out.println(ad.peek());

//		ad.push(23);
//		ad.push(12);
//		ad.push(42);
//		
//		ad.removeLast();
//		ad.removeFirst();
//		System.out.println(ad.peek());
		
		MyDeque<Integer> md = new MyDeque<>();
		md.addToHead(45);
		md.addToHead(12);
		
		System.out.println(md.removeLast());
		
	}

}
