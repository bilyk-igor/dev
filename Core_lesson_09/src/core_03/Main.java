package core_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("anton", 12));
		persons.add(new Person("roma", 42));
		persons.add(new Person("ira", 23));
		persons.add(new Person("nika", 20));
		
		ListIterator<Person> listIterator = persons.listIterator(persons.size());
		
		while(listIterator.hasPrevious()){
//			System.out.println(listIterator.previous());
			if(listIterator.previous().getName().equals("roma")){
				listIterator.set(new Person("some", 1000));
			}
			
		}
		
		System.out.println(persons);
		
		
		
		
//		Iterator<Person> iterator = persons.iterator();
//		
//		while(iterator.hasNext()){
////			System.out.println(iterator.next());
//			
//			Person removePerson = iterator.next();
//			
//			if(removePerson.getName().equals("roma") 
//					&& removePerson.getAge() == 42){
//				iterator.remove();
//			}
//			
//		}
//		
//		System.out.println(persons);
//		
		
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
		
		
//		for(int i = 0; i < persons.size(); i++){
//		
//			if(persons.get(i).getName().equals("roma")){
////				persons.remove(i);
//				persons.remove(persons.get(i));
//			}
//			System.out.println(persons.get(i));
//		}
		
//		for(Person p : persons){
////			System.out.println(p);
//
//			if(p.getName().equals("roma")){
//				persons.remove(p);
//			}
//		
//		}
		
//		System.out.println(persons);
		
		
		
	}
	
}
