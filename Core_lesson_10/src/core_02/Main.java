package core_02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		// Set<Integer> set = new TreeSet<>();
		// set.add(1432);
		// set.add(10272);
		// set.add(3345);
		// set.add(800);
		// set.add(142346);
		// set.add(0);
		//
		//
		// for (Integer i: set) {
		//
		// System.out.println(i);
		// }

//		Comparator<Beer> comparator = new SortByName();
		
//		Set<Beer> beers = new TreeSet<>(new SortByName().thenComparing(new SortbyPrice()));

		Set<Beer> beers = new TreeSet<>((o1,o2) -> o1.getPrice() - o2.getPrice());

		
		beers.add(new Beer("obolon'", 10));
		beers.add(new Beer("stella artua", 10));
		beers.add(new Beer("zenuk", 20));
		beers.add(new Beer("1715", 15));

		for (Beer beer : beers) {
			
			System.out.println(beer);
			
		}
		
		
		
		
		
//		System.out.println(beers.add(new Beer("1715", 15)));
//
//		if (beers.isEmpty()) {
//
//		} else {
//
//			Beer beer = new ArrayList<>(beers).get(0);
//
//			for (Beer i_beer : beers) {
//
//				if (i_beer.getPrice() > beer.getPrice()) {
//					beer = i_beer;
//				}
//
//			}
//
//			System.out.println(beer);
//
//		}

	}

}
