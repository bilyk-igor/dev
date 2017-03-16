package core_03;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {

//		Set<Integer> set = new HashSet<Integer>();
//		
//		set.add(12);
//		set.add(1);
//		set.add(10);
//		set.add(9);
//		set.add(15);
//		set.add(11);
//		set.add(1000);
//		set.add(1000);
//		
//		
//		for (Integer i : set) {
//			
//			System.out.println(i);
//			
//		}
		
		
		Set<Pie> pies = new TreeSet<>(new SortByName().thenComparing(new SortByPrice()));
//		
		
//		Set<Pie> pies = new TreeSet<>((e1 , e2) -> e1.getName().compareTo(e2.getName()));
		
		
		pies.add(new Pie("napoleon", 160));
		pies.add(new Pie("gold key", 230));
		pies.add(new Pie("sharlotka", 100));
		pies.add(new Pie("apple", 80));
		pies.add(new Pie("apple", 801));
//		System.out.println(pies.add(new Pie("apple", 80)));
//		
		for (Pie pie : pies) {
			
			System.out.println(pie);
			
		}
		
		
		
		
		
		
		
		
		
//		String name = "";
//		int maxPrice = 0;
//		
//		for (Pie pie : pies) {
//			
//			if(pie.getPrice() > maxPrice){
//				maxPrice = pie.getPrice();
//				name = pie.getName();
//			}
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
