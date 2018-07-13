package property;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class T {
	public static void main(String[] args) {
		File file = new File("C:/Users/Administrator/Desktop/132.txt");
		try(FileOutputStream fileOutputStream = new FileOutputStream(file)){
			byte[] b = {(byte) 0xE5, (byte) 0xB1, (byte) 0x8c};
			fileOutputStream.write(b);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
