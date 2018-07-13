package property;

import java.io.File;


public class MaxFile {
	
    static long maxSize = 0;
    static File maxFile = null;
	
	public static void main(String[] args) {
		File file = new File("C:/Users/Administrator/");
		findFiles(file);
		System.out.println(maxFile + "，其大小为" + maxFile.length() / 1024 / 1024 + "MB");
	}
	
	public static void findFiles(File f) {
		File[] files = f.listFiles();
		
		for(File file : files) {
			if(file.length() > maxSize) {
				maxSize = file.length();
				maxFile = file;
			}
			if(file.isDirectory()) {
				findFiles(file);
			}
			
		}
	}
	
}
