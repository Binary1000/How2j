package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class TestSerial {
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[10];
		for(int i = 0; i < 10; ++i) {
			Animal animal = new Animal();
			animal.species = "dog" + i;
			animal.name = "doggy" + i;
			animals[i] = animal;
		}
		
		File file = new File("C:/Users/Administrator/Desktop/1.txt");
		try(
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			FileInputStream fileInputStream = new FileInputStream(file);
			ObjectInputStream objectInputStream  = new ObjectInputStream(fileInputStream);
		){
			objectOutputStream.writeObject(animals);
			Animal[] animals2 = (Animal []) objectInputStream.readObject();
			for(Animal animal : animals2) {
				System.out.println(animal.species);
				System.out.println(animal.name);
			}
		}catch (Exception e) {
			
		}
		
	}
}
