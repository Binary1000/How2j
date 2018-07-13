package arraylist;

import java.util.LinkedList;
import java.util.Queue;



public class TestCollection {
	public static void main(String[] args) {
		Queue<Hero> queue = new LinkedList<Hero>();
		queue.offer(new Hero("hero1"));
		queue.offer(new Hero("hero2"));
		System.out.println(queue);
		queue.peek();
		System.out.println(queue);
	}
}
