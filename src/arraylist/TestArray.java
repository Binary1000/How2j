package arraylist;

import java.util.ArrayList;


public class TestArray {
	public static void main(String[] args) {
		ArrayList<Hero> arrayList = new ArrayList<Hero>();
		for(int i = 0; i < 100; ++i) {
			arrayList.add(new Hero("Hero " + i));
		}
		for(int i = 0; i < arrayList.size(); i++) {
			if(Integer.parseInt(arrayList.get(i).getName().substring(5)) % 8 ==0) {
				arrayList.remove(i);
			}
		}
		for(int i = 0; i < arrayList.size(); ++i) {
			System.out.println(arrayList.get(i));
		}
	}
}
