package core_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {

		List<Auto> autos = new ArrayList<>();

		autos.add(new Auto("mazda", 10));
		autos.add(new Auto("bmw", 15));
		autos.add(new Auto("lada", 12));
		autos.add(new Auto("volvo", 5));
		
		ListIterator<Auto> listIterator = autos.listIterator(autos.size());
		
		while(listIterator.hasPrevious()){
//			System.out.println(listIterator.previous());
			
			if(listIterator.previous().getBrend().equals("mazda")){
				listIterator.add(new Auto("zaz", 23));				
			}
			
		}
		
		
		
		
//		
//		Iterator<Auto> iterator = autos.iterator();
//		
//		while(iterator.hasNext()){
////			System.out.println(iterator.next());
//			
//			Auto auto = iterator.next();
//			if(auto.getBrend().equals("mazda") 
//					&& auto.getAge() == 10){
//				iterator.remove();
//			}
//		}
//		
//		System.out.println(autos);
		
		
		
		
		

//		 for(int i =0; i < autos.size(); i++){
//			 System.out.println(autos.get(i));
//			 if(autos.get(i).getBrend().equals("mazda")){
//				 autos.remove(i);
//				 autos.remove(autos.get(i));
//			 }
//		 }

//		Auto auto = null;
//		
//		for (Auto a : autos) {
//			if (a.getBrend().equals("mazda")) {
//				auto = a;
//			}
//		}
//		autos.remove(auto);
//		
//		System.out.println(autos);

	}

}
