package core_04;

public class Main {
	public static void main(String[] args) {

		Car sportCar = new Car("porshe", 80, 5);

		Car minivan = new Car("ford", 120, 6);

		// System.out.println(sportCar.brend);
		// System.out.println(minivan.brend);
		//

		// System.out.println(minivan.brend+" can range "+minivan.fuelOfTank *
		// minivan.kmPerLitr);

		
//		sportCar.range();
//		minivan.range();
		double cof = 0.98;//5
//		
//		double totalrange = minivan.range2() * cof;
//	
//		System.out.println(totalrange);
		
		System.out.println(minivan.totalRenge(cof));
		
		
	}
}
