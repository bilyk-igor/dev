package core_04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
//		Set<Integer> set = new HashSet<>();
//		
//		set.add(12);
//		set.add(1);
//		set.add(3);
//		set.add(9);
//		set.add(14);
//		set.add(8);
//		set.add(600);
//		set.add(6);
//		set.add(7);
//		System.out.println(set.add(7));
//		
//		
//		for (Integer i : set) {
//			
//			System.out.println(i);
//			
//		}
		
//		Comparator<Watch> comparator = new SortByBrend();
		
//		Set<Watch> watchs = new TreeSet<>(new SortByBrend().thenComparing(new SortByPrice()));
		
		Set<Watch> watchs = new TreeSet<>((e1,e2) -> e1.getBrend().compareTo(e2.getBrend()));
		
		watchs.add(new Watch("tissot", 1000));
		watchs.add(new Watch("panerai", 2000));
		watchs.add(new Watch("some", 8000));
		watchs.add(new Watch("rolex", 10000));
		watchs.add(new Watch("pobeda", 8000));
		
		String w_name = "";
		int m_price = 0;
		
		
		for (Watch watch : watchs) {
			if(m_price < watch.getPrice()){
				m_price = watch.getPrice();
				w_name = watch.getBrend();
			}
		}
		
		
		List<Watch> list = new ArrayList<>(watchs);
		
		if(list.isEmpty()){
			
		}else{
			Watch watch = list.get(0);
			
			for (Watch w : list) {
				
				if(w.getPrice() > watch.getPrice()){
					watch = w;
				}
				
			}
			
			System.out.println(watch);
			
			
		}
		
		
		
		
		
//		list.addAll(watchs);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
