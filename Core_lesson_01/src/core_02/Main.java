package core_02;

public class Main {
	public static void main(String[] args) {

		Car minivan = new Car("doodge", 80, 7);
		
		Car sportCar = new Car("Lada", 200, 100);
		
		sportCar.brend = "porshe";
		
//		System.out.println(minivan.toString());
//		
//		System.out.println(sportCar.toString());
//		
//		System.out.println(sportCar.brend+" can range "+sportCar.fuelOfTank * sportCar.kmPerLitr);
		
//		sportCar.range();
//		minivan.range();
//		
//		double totalRange = sportCar.range2() * 0.97;
//		
//		System.out.println(totalRange);
		
		System.out.println(minivan.totalRange(0.98));;
		
		
		
	}
}
