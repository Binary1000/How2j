package property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SplitFile {
	public static void main(String[] args) {
		try {
			final int splitSize = 1;
			String fileName = "C:/Users/Administrator/Desktop/1/1.txt";
			File file = new File(fileName);
			FileInputStream fileInputStream = new FileInputStream(file);
			byte[] all = new byte[(int) file.length()];
			fileInputStream.read(all);
			int len = all.length;
			int times;
			if(0 == len % splitSize) {
				times = len / splitSize;
			}else {
				times = len / splitSize + 1;
			}
			for(int i = 0; i < times; ++i) {
				int off = i * splitSize;
				File file1 = new File(fileName + "-" + i);
				FileOutputStream fileOutputStream = new FileOutputStream(file1);
				fileOutputStream.write(all, off, splitSize);
				fileOutputStream.close();
			}
			fileInputStream.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
