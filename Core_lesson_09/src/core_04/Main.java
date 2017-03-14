package core_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<>();
		
		animals.add(new Animal("dog", 2));
		animals.add(new Animal("cat", 3));
		animals.add(new Animal("frog", 1));
		animals.add(new Animal("aligator", 5));
		
		ListIterator<Animal> listIterator = animals.listIterator(animals.size());
		
		while(listIterator.hasPrevious()){
//			System.out.println(listIterator.previous());
			if(listIterator.previous().getName().equals("frog")){
				listIterator.set(new Animal("some", 123));
			}
		}
		
		System.out.println(animals);
		
		
//		Iterator<Animal> iterator = animals.iterator();
		
//		for (int i = 0; iterator.hasNext(); i++) {
//			
//		}
		
		
//		
//		while(iterator.hasNext()){
//			
//			Animal animal = iterator.next();
//			
//			if(animal.getName().equals("cat")
//					&& animal.getAge() == 3){
//				iterator.remove();
//			}
//			
//		}
		
		
		
		
		
//		for(int i = 0; i < animals.size(); i++){
//			System.out.println(animals.get(i));
//			
//			if(animals.get(i).getName().equals("aligator")){
//				animals.remove(i);
//				animals.remove(animals.get(i));
//			}
//			
//		}
		
//		Animal animal = null;
//		
//		for(Animal a :animals){
//			
//			if(a.getName().equals("aligator") && a.getAge() == 5){
////				animals.remove(a);
//				animal = a;
//			}
//			
//		}
//		
//		animals.remove(animal);
//		
//		System.out.println(animals);
		
		
		
	}
	
}
