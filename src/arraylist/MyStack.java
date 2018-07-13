package arraylist;

import java.util.LinkedList;

public class MyStack implements Stack {
	
	private LinkedList<Hero> list = new LinkedList<Hero>();

	@Override
	public void push(Hero h) {
		// TODO Auto-generated method stub
		list.addLast(h);
	}

	@Override
	public Hero pull() {
		// TODO Auto-generated method stub
		return list.removeLast();
	}

	@Override
	public Hero peek() {
		// TODO Auto-generated method stub
		return list.getLast();
	}

}
