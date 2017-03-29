package core_04;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Person<String, Integer> person =new Person<>("olga",23);
		
		Person<Integer, Double> person2 = new Person<>(123, 12.4);
		
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
