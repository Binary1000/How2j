package animal;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		Random random = new Random();
		try {
			System.out.println(random.nextInt(-1));
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(1);
	}
}
