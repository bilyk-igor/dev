package consultation;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>(
				Arrays.asList(new Person(1, "person1", 10, 100), 
						new Person(2, "person2", 20, 200),
						new Person(3, "person3", 30, 300), 
						new Person(4, "person4", 40, 400)));

		System.out.println(persons.stream().max((p1, p2) -> 
					p1.getAge() - p2.getAge()).get().getName());
		System.out.println(persons.stream().max((p1, p2) -> 
					p1.getName().compareTo(p2.getName())).get().getName());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
