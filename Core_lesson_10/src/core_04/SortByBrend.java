package core_04;

import java.util.Comparator;

public class SortByBrend implements Comparator<Watch>{

	@Override
	public int compare(Watch o1, Watch o2) {
		
		
		return o1.getBrend().compareTo(o2.getBrend());
	}
	
	

}
