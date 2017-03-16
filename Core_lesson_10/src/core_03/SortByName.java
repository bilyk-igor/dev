package core_03;

import java.util.Comparator;

public class SortByName implements Comparator<Pie>{

	@Override
	public int compare(Pie o1, Pie o2) {
		
//		System.out.println(o1.getName().compareTo(o2.getName()));
		
		return o1.getName().compareTo(o2.getName());
	}
	

}
