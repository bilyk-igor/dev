package consultation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

	
//		  List<Person> persons = new ArrayList<>(Arrays.asList(new Person(1,
//		  "person1", 10, 100), new Person(2, "person2", 20, 200), new Person(3,
//		  "person3", 30, 300), new Person(4, "person4", 40, 400)));
//		 
//		  FileWriter fileWriter = new FileWriter("persons.txt");
//		  
//		  for (Person person : persons) { fileWriter.write(person.toString());
//		  fileWriter.flush(); }
//		  
//		  fileWriter.close();
//		 
//
//		BufferedReader bufferedReader = new BufferedReader(new FileReader("persons.txt"));
//
//		String line = "";
//
//		 List<Person> personsFromFile = new ArrayList<>();
//		
//		 String[] infoPerson = null;
//		
//		 while ((line = bufferedReader.readLine()) != null) {
//		
//		 infoPerson = line.split(", ");
//		
//		 Person person = new Person(Integer.parseInt(infoPerson[0].split("= ")[1]), infoPerson[1].split("= ")[1],
//		 Integer.parseInt(infoPerson[2].split("= ")[1]),
//		 Double.parseDouble(infoPerson[3].split("= ")[1]));
//		
//		 personsFromFile.add(person);
//		
//		 }
//
//		bufferedReader.close();
//		 
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("enter id of person");
//
//		int id = scanner.nextInt();
//
//		boolean exist = false;
//
//		String newLine = "";
//		
//		BufferedReader bf = new BufferedReader(new FileReader("persons.txt"));
//
//		
//		
//		while ((newLine = bf.readLine()) != null) {
//
//			if(newLine.contains("id= "+id)){
//				
//			}
//			
//			
//			
//			int index = newLine.indexOf(',');
//			
//			int number = Integer.parseInt(newLine.substring(4, index));
//
//			if (number == id) {
//				System.out.println("id exist");
//				exist = true;
//			}
//
//		}
//
//		if (!exist) {
//			
//			Person person = 
//					new Person(id, scanner.next(), scanner.nextInt(), scanner.nextDouble());
//			
//			personsFromFile.add(person);
//			
//			FileWriter fileWriter = new FileWriter("persons.txt");
//			
//			for (Person p : personsFromFile) {
//				fileWriter.write(p.toString());
//				fileWriter.flush();
//			}
//			fileWriter.close();
//			
//			
//		}

	}
}
