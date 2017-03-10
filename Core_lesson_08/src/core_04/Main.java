package core_04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

	
//		ArrayList arrayList = new ArrayList();
//		
//		List list2 = new LinkedList();
//		
//		LinkedList linkedList = new LinkedList();
		
//		List<Main> list = new ArrayList();
//
//		list.add(1);
//		list.add("sdfas");
//		list.add(12.43);
//		list.add(new Main());
//		
//		list.get
		
		List<Auto> autos = new ArrayList<>();
		
		Auto auto = new Auto(10000, "lada");
		
		System.out.println(auto.getBrend().hashCode());
		
		autos.add(new Auto(10000, "lada"));
		autos.add(new Auto(20000, "mazda"));
		autos.add(new Auto(30000, "some"));
		
		
//		System.out.println(autos.size());
//		System.out.println(autos.isEmpty());
//		System.out.println(autos.get(3));
//		
//		System.out.println(autos.remove(1));
		
		autos.add(1, new Auto(2345, "new"));
		
//		System.out.println(autos);
		
		for(Auto a : autos){
			
			if(a.equals(auto)){
				System.out.println("exist");
			}
			
//			if(a.getPrice() == auto.getPrice() &&
//					a.getBrend().equals(auto.getBrend())){
//				System.out.println("exist");
//				
//			}
			
			
		}
		
		
		
		
		
	
	}
}
