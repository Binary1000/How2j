package property;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class TestReader {
	public static void main(String[] args) {
		File encodingFile = new File("C:/Users/Administrator/Desktop/1.txt");
		File encodedFile = new File("C:/Users/Administrator/Desktop/12.txt");
		encodeFile(encodingFile, encodedFile);
	}
	
	public static  void encodeFile(File encodingFile, File encodedFile) {
		try(FileReader fileReader = new FileReader(encodingFile); FileWriter fileWriter = new FileWriter(encodedFile)){
			char[] all = new char[(int) encodingFile.length()];
			fileReader.read(all);
			System.out.println(all);
			for(int i = 0; i < all.length; ++i) {
				char c = all[i];
				if(isLetterOrDigit(c)) {
					switch (c) {
					case '9':
						all[i] = '0';
						break;
					case 'Z':
						all[i] = 'A';
						break;
					case 'z':
						all[i] = 'z';
						break;
					default:
						all[i]++;
						break;
					}
				}
			}
			fileWriter.write(all);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean isLetterOrDigit(char c) {
		String letterOrDigital = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		return letterOrDigital.indexOf(c) == -1 ? false : true;
	}

}
