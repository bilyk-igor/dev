package core_04;

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

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectOutputStream objectOutputStream = 
				new ObjectOutputStream(new FileOutputStream("persons.txt"));
		
		Person person1 = new Person("igor", 23);
		Person person2 = new Person("anna", 32);
		Person person3 = new Person("vova", 22);
		
//		List<Person> list = new ArrayList<>();
//		list.add(person1);
//		list.add(person2);
//		list.add(person3);
//		
//		objectOutputStream.writeObject(list);
		objectOutputStream.writeObject(person1);
		objectOutputStream.writeObject(person2);
		objectOutputStream.writeObject(person3);
//		
//		objectOutputStream.close();
//		
		ObjectInputStream objectInputStream = 
				new ObjectInputStream(new FileInputStream("persons.txt"));
//		
//		System.out.println(objectInputStream.readObject());
//		
//		List<Person> persons = (List<Person>)objectInputStream.readObject();
//		
//		for (Person person : persons) {
//			System.out.println(person);
//		}
//		
//		try{
//			
//			while(true){
////				System.out.println(objectInputStream.readObject());
//				
//				Person person = (Person)objectInputStream.readObject();
//				
//				System.out.println(person.getName());
//				
//			}
//			
//		}catch (EOFException e) {
//		}	
//		
//		objectInputStream.close();
		
//		Pet pet = new Pet("barsik", 10);
//		
//		pet.writeExternal(new ObjectOutputStream(new FileOutputStream("pets.txt")));
//		
//		pet.readExternal(new ObjectInputStream(new FileInputStream("pets.txt")));
//		
		
		Person maxAgePerson = (Person)objectInputStream.readObject(); 
		
		try{
			
			while(true){
				
				Person p = (Person)objectInputStream.readObject();
			
				if(p.getAge() > maxAgePerson.getAge()){
					maxAgePerson = p;
				}
				
			}
			
		}catch (EOFException e) {
			// TODO: handle exception
		}
		
		System.out.println(maxAgePerson);
		
	}
	
}
