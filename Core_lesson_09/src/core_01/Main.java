package core_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		ListIterator<String> listIterator = list.listIterator(list.size());
		
		while(listIterator.hasPrevious()){
			
//			System.out.println(listIterator.previous());
			
			if(listIterator.previous().equals("two")){
				
				listIterator.set("six");
				
			}
			
		}
		
		System.out.println(list);
		
		
//		Iterator<String> iterator = list.iterator();
//		
//		while(iterator.hasNext()){
//			System.out.println(iterator.next());
//			String current = iterator.next();
//			
//			if(current.startsWith("o") && current.endsWith("e")){
//				iterator.remove();
//			}
//			
//			
//		}
		
		
		
		
//		System.out.println(iterator.next());
		
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//			if(list.get(i).equals("three")){
//				list.remove(list.get(i));
//				list.remove(i);
//			}
//		
//		}
		
//		String index = "";
//		
//		for(String s: list){
//			
//			if(s.equals("three")){
//				index = s;
//			}
//			//
//		}
//		
//		list.remove(index);
//		
		
//		System.out.println(list);
		
		
		
		
		
		
	}
	
	
}
