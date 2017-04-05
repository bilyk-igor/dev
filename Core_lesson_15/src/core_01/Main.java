package core_01;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		 FileOutputStream fileOutputStream = new
		 FileOutputStream("persons.txt");
		
		 ObjectOutputStream objectOutputStream = new
		 ObjectOutputStream(fileOutputStream);
		
		 Person person1 = new Person("koko", 26);
		 Person person2 = new Person("toto", 30);
		 Person person3 = new Person("toto", 30);
		 Person person4 = new Person("toto", 30);
		 Person person5 = new Person("toto", 30);
		 
		 
		 
		 
//		
//		 List<Person>  persons = new ArrayList<>();
//		 
//		 persons.add(person1);
//		 persons.add(person2);
//		 
//		 objectOutputStream.writeObject(persons);
		// objectOutputStream.writeObject(person2);
		//
		// objectOutputStream.close();

		FileInputStream fileInputStream = new FileInputStream("persons.txt");

		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

//		List<Person> deserializablePersons = (List<Person>)inputStream.readObject();
//		
//		for (Person person : deserializablePersons) {
//			
//			System.out.println(person);
//			
//		}
		Person person = (Person)inputStream.readObject();
		int max = person.getAge();
		try {
			while (true) {
//				System.out.println(inputStream.readObject());
				Person p1 = (Person)inputStream.readObject();

				if(p1.getAge() > max){
					max = p1.getAge();
				}
			
			}
		} catch (EOFException e) {
			// TODO: handle exception
		}
		
		
		Pet pet = new Pet("barsik", 10);
		
//		pet.writeExternal(new ObjectOutputStream(new FileOutputStream("pets.txt")));
		
		pet.readExternal(new ObjectInputStream(new FileInputStream("pets.txt")));
		
		
		
		
		
		
		

	}
}
