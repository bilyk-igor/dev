package core_01;

import java.util.Comparator;

public class SortByAge implements Comparator<Human>{

	@Override
	public int compare(Human o1, Human o2) {
		// TODO Auto-generated method stub
		return o1.getAge() - o2.getAge();
	}

	
	
}
