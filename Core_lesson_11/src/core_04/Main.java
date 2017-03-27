package core_04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

//		Map<Integer, String> map = new HashMap<>();
//		
//		map.put(10, "ten");
//		map.put(20, "twenty");
//		map.put(30, "thrity");
//		map.put(40, "fourty");
//		map.put(40, "fifty");
//		
//		System.out.println(map.containsKey(10));
//		System.out.println(map.values());
//		System.out.println(map.get(10).toUpperCase());
//		System.out.println(map.remove(20));
//		
//		System.out.println(map);
		
//		Set<Entry<Integer, String>> set = map.entrySet();
//		
//		int maxNumber = map.keySet().iterator().next();
//		String value = "";
//		
//		for (Entry<Integer, String> entry : set) {
//			
//			if(maxNumber < entry.getKey()){
//				maxNumber  = entry.getKey();
//				value = entry.getValue();
//			}
//		}
//		
//		System.out.println(value);
		
		Map<Person, List<Auto>> map = new HashMap<>();
		
		List<Auto> list1 = new ArrayList<>();
		list1.add(new Auto("mazda", 2));
		list1.add(new Auto("lada", 4));
		
		
		List<Auto> list2 = new ArrayList<>();
		list2.add(new Auto("oka", 8));
		list2.add(new Auto("smart", 1));
		
		
		map.put(new Person("igor", 22), list1);
		map.put(new Person("ira", 21), list2);
		
		int currentYears = 0;
		int maxYears = 0;
		String name = "";
		
		Set<Entry<Person, List<Auto>>> set = map.entrySet();
		
		for (Entry<Person, List<Auto>> entry : set) {
			
			for(Auto auto : entry.getValue()){
				currentYears = currentYears + auto.getYear();
				
				
			}
			
			if(maxYears < currentYears){
				maxYears = currentYears;
				name = entry.getKey().getName();
			}
			
			currentYears = 0;
			
		}
		System.out.println(name+" "+maxYears);
		
		
		
		
				
				
				
				
				
		
//		String name = "";
//		int maxYears = 0;
//		
//		for(List<Auto> list : map.values()){
//			
//			for (Auto auto : list) {
//				
//				if(auto.getYear()> maxYears){
//					maxYears = auto.getYear();
//					name = auto.getBrend();
//				}
//				
//			}
//			
//		}
//		
//		System.out.println(name+" "+maxYears);
//		
		
		
	}
}
