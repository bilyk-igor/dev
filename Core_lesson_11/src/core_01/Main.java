package core_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		// Map<Person, Auto> map = new HashMap<>();
		//
		// map.put(new Person("anton", 32), new Auto("mazda", 4));
		// map.put(new Person("ira", 23), new Auto("bmw", 2));
		// map.put(new Person("ivan", 20), new Auto("lada", 5));
		//
		// Set<Entry<Person, Auto>> set = map.entrySet();
		//
		//// int maxYear = set.iterator().next().getValue().getYears();
		////
		//// String brend = "";
		////
		//// for(Entry<Person, Auto> e : set){
		////
		//// if(e.getValue().getYears() > maxYear){
		//// maxYear = e.getValue().getYears();
		////
		//// brend = e.getValue().getBrend();
		////
		//// }
		////
		//// }
		////
		//// System.out.println(brend+" " +maxYear);
		//
		//
		//
		// int maxYear = set.iterator().next().getValue().getYears();
		//
		// String brend = "";
		// String personName = "";
		//
		// for(Entry<Person, Auto> e : set){
		//
		// if(e.getValue().getYears() < maxYear){
		// maxYear = e.getValue().getYears();
		//
		// brend = e.getValue().getBrend();
		//
		// personName = e.getKey().getName();
		// }
		//
		// }
		//
		// System.out.println(personName+" "+brend+" " +maxYear);
		//
		//

		Map<Person, List<Auto>> map = new HashMap<>();

		// List<Auto> autos = new ArrayList<>();
		//
		// autos.add(new Auto("oka", 12));

		map.put(new Person("vova", 23), Arrays.asList(new Auto("oka", 12), new Auto("bmw", 3)));

		map.put(new Person("ira", 32), Arrays.asList(new Auto("mers", 4), new Auto("lexus", 10)));

		Set<Entry<Person, List<Auto>>> set = map.entrySet();

		int maxYears = 0;

		int currentYears = 0;

		String name = "";

		for (Entry<Person, List<Auto>> entry : set) {

			for (Auto auto : entry.getValue()) {

				currentYears = currentYears + auto.getYears();

			}

			if (currentYears > maxYears) {
				maxYears = currentYears;
				name = entry.getKey().getName();
			}

			currentYears = 0;
		}
		
		System.out.println(name);

	}

}
