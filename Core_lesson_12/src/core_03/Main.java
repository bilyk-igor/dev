package core_03;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Person<String, Integer> person = new Person<>("olga", 12);

		Person<Long, Byte> person2 = new Person<Long, Byte>(1000L, (byte) (20));

		System.out.println(person.getName().getClass().getSimpleName().equals("String"));
		System.out.println(person.getName() instanceof String);
		
		List<Person> list = new ArrayList<Person>();
		
		
		list.add(person);
		list.add(person2);
 
		
		
		double sum = 0;
		
		for (Person p : list) {
			
			if(p.getName() instanceof Number){
				sum += Double.parseDouble(String.valueOf(p.getName()));
			}
			sum += Double.parseDouble(String.valueOf(p.getAge()));
			
		}
		
		System.out.println(sum);
		
	}

}
