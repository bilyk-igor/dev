package core_02;

import java.util.Comparator;

public class SortByName implements Comparator<Beer>{

	@Override
	public int compare(Beer o1, Beer o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

	
	
}
