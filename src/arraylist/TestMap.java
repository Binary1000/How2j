package arraylist;

import java.util.ArrayList;
import java.util.List;

public class TestMap {
	public static void main(String[] args) {
		List<Hero> list = new ArrayList<Hero>();
		for(int i = 0; i < 3000000; i++) {
			Hero hero = new Hero("hero-" + random());
			list.add(hero);
		}
		int n = 0;
		for(Hero hero : list) {
			if(hero.getName().equals("hero-5555")) {
				n++;
			}
		}
		System.out.println(n);
	}
	
	
	public static int random() {
		return ((int)(Math.random()*9000)+1000);
	}
}
