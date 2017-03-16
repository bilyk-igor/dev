package core_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {

		// Set<Integer> set = new LinkedHashSet<>();
		//
		// set.add(10);
		// set.add(12);
		// set.add(4);
		// set.add(7);
		// set.add(9);
		// set.add(3);
		// set.add(1000);
		//

		// for (Integer integer : set) {
		// System.out.println(integer);
		// }

		
		
//		Set<Human> humans = new TreeSet<>(new SortByName()
//				.thenComparing(new SortByAge()));

		Comparator<Human> comparator = new SortByAge().thenComparing(new SortByName());
		

		Set<Human> humans = new TreeSet<>((e1,e2) -> e1.getAge() - e2.getAge());
//
//		
//		humans.add(new Human("anton", 12));
//		humans.add(new Human("vira", 12));
//		humans.add(new Human("igor", 43));
//		humans.add(new Human("petro", 26));
//
//	
//		for (Human human : humans) {
//		
//			System.out.println(human);
//			
//		}
		
		
//		System.out.println(humans.add(new Human("anton", 11)));
//
//		System.out.println(humans);

		
//		Set<String> set = new TreeSet<>();
//		
//		set.add("aaa");
//		set.add("zzz");
//		set.add("bbb");
//		set.add("rrr");
//		set.add("ccc");
//		set.add("www");
//		set.add("qqq");
//		
//		for (String string : set) {
//			System.out.println(string);
//		}
		
		
//		Set<Human> humans = new HashSet<>();
//
//		humans.add(new Human("anton", 12));
//		humans.add(new Human("vira", 12));
//		humans.add(new Human("igor", 43));
//		humans.add(new Human("petro", 26));
//
//	
//		List<Human> list = new ArrayList<Human>(humans);
//		
//		Collections.sort(list, new SortByAge().thenComparing(new SortByName()));
//		
//		for (Human human : list) {
//			System.out.println(human);
//			
//		}
		
		
		
		
		
		
	}
}
