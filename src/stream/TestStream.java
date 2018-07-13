package stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;


public class TestStream {
	public static void main(String[] args) {
		File file = new File("C:/Users/Administrator/Desktop/1.txt");
		removeComments(file);
	}
	
	public static void read() {
		File file = new File("C:/Users/Administrator/Desktop/1.html");
		try (
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
			)
		{
			while(true) {
				String line = bufferedReader.readLine();
				if(line == null) break;
				System.out.println(line);
			}
		} catch (Exception e) {
			
		}
	}
	
	public static void write() {
		File file = new File("C:/Users/Administrator/Desktop/1.txt");
		try (
				FileWriter fileWriter = new FileWriter(file);
				PrintWriter printWriter = new PrintWriter(fileWriter);
			)
		{
			printWriter.println("Writing is learned by imitation.");
			printWriter.println("Alex Mercer");
		} catch (Exception e) {
			
		}
	}
	
	public static void removeComments(File file) {
		ArrayList<String> list = new ArrayList<String>();
		try (
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
			)
		{
			while(true) {
				String line = bufferedReader.readLine();
				if(line == null) break;
				if(!line.startsWith("//")) {
					list.add(line);
				}
			}
		} catch (Exception e) {
			
		}
		try (
				FileWriter fileWriter = new FileWriter(file);
				PrintWriter printWriter = new PrintWriter(fileWriter);
			)
		{
			for(String string : list) {
				printWriter.println(string);
			}
		} catch (Exception e) {
			
		}
		
	}
	
}
