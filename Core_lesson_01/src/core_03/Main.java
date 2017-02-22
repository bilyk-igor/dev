package core_03;

public class Main {

	public static void main(String[] args) {

		 Car minivan = new Car("bmw", 60, 7);
		 
		 Car sportCar = new Car("McLaren", 70, 2);

//		 System.out.println(minivan.brend+" can range "+minivan.fuelOfTank*minivan.kmPerLitr);
	
		 minivan.range();
		 sportCar.range();
	  
		 System.out.println(minivan.totalRange(0.97));
		 
		  
		 
	}

}
