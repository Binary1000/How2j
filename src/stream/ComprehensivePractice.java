package stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ComprehensivePractice {
	
	public static void copyFile(String srcFile, String desFile) {
		File file1 = new File(srcFile);
		File file2 = new File(desFile);
		String string = null;
		try (
				FileReader fileReader = new FileReader(file1);
		){
			char[] cbuf = new char[(int) file1.length()];
			fileReader.read(cbuf);
			string = new String(cbuf);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (
				FileWriter fileWriter = new FileWriter(file2);
		){
			if(string != null) {
				fileWriter.write(string);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void search(File folder, String keyWord) {
		File[] files = folder.listFiles();
		for(File file : files) {
			if(file.isDirectory()) {
				search(file, keyWord);
			}else {
				try (
						FileReader fileReader = new FileReader(file);
				){
					char[] cbuf = new char[(int) file.length()];
					fileReader.read(cbuf);
					String string = new String(cbuf);
					if(string.indexOf(keyWord) != -1) {
						System.out.println(file.getAbsolutePath());
					}
				} catch (Exception e) {
					
				}
			}
			
		}
	}
	
	
	public static void main(String[] args) {
//		String srcFile = "C:/Users/Administrator/Desktop/Test.java";
//		String desFile = "C:/Users/Administrator/Desktop/Test12.java";
//		copyFile(srcFile, desFile);
		
		File folder = new File("C:/Users/Administrator/Desktop/");
		String keyWord = "Binary";
		search(folder, keyWord);
		
	}
	
}
