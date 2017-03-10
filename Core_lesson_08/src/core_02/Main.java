package core_02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		// ArrayList arrayList = new ArrayList();
		//
		// List list = new ArrayList();
		//
		//
		// LinkedList linkedList = new LinkedList();
		//
		// List list2 = new LinkedList();

		// List<String> list = new ArrayList<>();
		//
		// list.add("one");

		List<Apple> apples = new ArrayList<>();

		apples.add(new Apple("golden de lushes", 1000));
		apples.add(new Apple("antonovka", 2000));
		apples.add(new Apple("black prince", 3000));

		System.out.println(apples.size());
		System.out.println(apples.isEmpty());
		System.out.println(apples.get(2));
		apples.add(2, new Apple("some", 100));

		// Apple apple = new Apple("black prince", 3000);

		// for (Apple index : apples) {
		//
		// if(index.equals(apple)){
		// System.out.println("yes");
		// }
		//
		// if(index.getType().equals(apple.getType()) &&
		// index.getPrice() == apple.getPrice()){
		// System.out.println("yes");
		// }

		// }
		//
		// System.out.println(apples.contains(apple));

		// System.out.println(apples);
		//
		// for (int i = 0; i < apples.size(); i++) {
		//
		// System.out.println(apples.get(i));
		//
		//
		// }
		//
		// System.out.println();
		//
		// for (Apple apple : apples) {
		// System.out.println(apple);
		// }

	}
}
