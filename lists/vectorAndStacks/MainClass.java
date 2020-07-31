package lists.vectorAndStacks;

public class MainClass {

	public static void main(String[] args) throws Exception {
//		Vector<Integer> v = new Vector<>();
//		
//		v.add(35);
//		v.add(23);
		
		MyStack<Integer> stack = new MyStack<>();
		
		stack.push(34);
//		stack.push(23);
//		stack.push(45);
		
		System.out.println(stack.pop());

		System.out.println(stack.peek());

	}

}
