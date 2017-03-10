package core_01;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
//		ArrayList arrayList = new ArrayList();
//		
//		List list = new ArrayList();  
//		
//		LinkedList linkedList = new LinkedList();
//		
//		List list2 = new LinkedList();
		
		
		List<Person> list = new ArrayList<>();
		
		list.add(new Person("anton", 30));
		list.add(new Person("ira", 23));
		list.add(new Person("vova", 40));
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.get(0));
		System.out.println(list.add(new Person("asd", 123)));
//		System.out.println(list.indexOf(new Person("vova", 40)));
		
		Person person1 = new Person("anton", 30);
		
//		System.out.println(list.contains(person));
		
		System.out.println(person1.getName().hashCode());
		
		System.out.println(person1.hashCode());
		
		for (Person person : list) {
			
			if(person.equals(person1)){
				System.out.println("yes");
			}
			
		}
		
		
		
		
//		for (int i = 0; i < list.size(); i++) {
//			
//			System.out.println(list.get(i));
//			
//		}
//		
//		System.out.println();
//		
//		for (Person person : list) {
//			
//			System.out.println(person);
//			
//		}
		
		
		
		
		
		
	}
	
}
