package core_02;

import java.util.Comparator;

public class SortbyPrice implements Comparator<Beer>{

	@Override
	public int compare(Beer o1, Beer o2) {
		// TODO Auto-generated method stub
		return o1.getPrice() - o2.getPrice();
	}
	
	

}
