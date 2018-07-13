package arraylist;

public class TestStack {
	public static void main(String[] args) {
		Stack stack = new MyStack();
		stack.push(new Hero("Hero1"));
		stack.push(new Hero("Hero2"));
		stack.push(new Hero("Hero3"));
		System.out.println(stack.pull());
		System.out.println(stack.pull());
	}
}
