package core_03;

public class Main {

	public static void main(String[] args) {

//		 Car minivan = new Car("bmw", 60, 7);
//		 
//		 Car sportCar = new Car("McLaren", 70, 2);

//		 System.out.println(minivan.brend+" can range "+minivan.fuelOfTank*minivan.kmPerLitr);
	
//		 minivan.range();
//		 sportCar.range();
//	  
//		 System.out.println(minivan.totalRange(0.97));
//		 
		 
		 int user = 127;
		 
		 int numbers [] = {50, 25, 10, 5, 2 ,1};
		  
		 for (int i = 0; i < numbers.length; i++) {
			if(user >= numbers[i]){
				System.out.println(numbers[i]+" "+user/numbers[i]);
				user = user % numbers[i];
			}
		}
		 
	}

}
