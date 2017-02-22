package core_01;

public class Main {
	public static void main(String[] args) {

		Car minivan = new Car("BMW", 60, 8);

		Car sportCar = new Car("McLaren", 120, 5);

//		System.out.println(minivan.toString());
//		System.out.println(sportCar.toString());

		// System.out.println(minivan.brend+ " can range "
		// +minivan.fuelOfTank*minivan.kmPerLitr);

//		sportCar.range();
//		minivan.range();
		
//		int totalRange = (int) (minivan.range2()* 0.3);
//		
//		System.out.println(totalRange);
//		System.out.println(minivan.range3());
		
//		minivan.range4(10, "black");
 
		int array [] = {3,23,532,4,123,5345,23,4,324,23,5};
		
		System.out.println(minivan.maxValue(array));
		
		
		
		
		
	}
}
