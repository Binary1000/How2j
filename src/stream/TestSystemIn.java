package stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class TestSystemIn {
	public static void main(String[] args) {
		generateClassAutomatically();
	}
	
	public static void  generateClassAutomatically() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入类的名称：");
		String className = scanner.nextLine();
		System.out.println("请输入属性的类型：");
		String type = scanner.nextLine();
		System.out.println("请输入属性的名称：");
		String property = scanner.nextLine();
		String Uproperty = property.substring(0, 1).toUpperCase() + property.substring(1);
		scanner.close();
		String string = null;
		File template = new File("C://Users/Administrator/Desktop/template.txt");
		try(FileReader fileReader = new FileReader(template);){
			char[] cbuf = new char[(int) template.length()];
			fileReader.read(cbuf);
			string = new String(cbuf);
			string = string.replaceAll("@class@", className).replaceAll("@type@", type).replaceAll("@property@", property).replaceAll("@Uproperty@", Uproperty);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String pathname = "C:/Users/Administrator/Desktop/" + className + ".java";
		File file = new File(pathname);
		try (
			FileWriter fileWriter = new FileWriter(file);
		){
			fileWriter.write(string);
			System.out.println("文件保存在：" + pathname);
		} catch (Exception e) {
			
		}
	}
}
