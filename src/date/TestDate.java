package date;

import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		Date date2 = new Date(5000);
		System.out.println(date2.getTime());
	}
}
