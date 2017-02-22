package core_01;

import java.util.Arrays;

public class Car {

	String brend;
	int fuelOfTank;
	int kmPerLitr;

	public Car() {

	}

	public Car(String brend, int fuelOfTank, int kmPerLitr) {
		super();
		this.brend = brend;
		this.fuelOfTank = fuelOfTank;
		this.kmPerLitr = kmPerLitr;
	}

	public void drive() {
		System.out.println("drive");
	}

	public void stop() {
		System.out.println("stop");
	}

	public void parking() {
		System.out.println("parking");
	}

	@Override
	public String toString() {
		return "Car [brend=" + brend + ", fuelOfTank=" + fuelOfTank + ", kmPerLitr=" + kmPerLitr + "]";
	}

	public void range() {
		System.out.println(brend + " can range " + fuelOfTank * kmPerLitr);
	}

	public int range2(){
		int range = fuelOfTank * kmPerLitr;
		System.out.println(brend + " can range "+range);
		return range;
	}
	
	public String range3(){
		
		return brend + " can range "+fuelOfTank * kmPerLitr;
		
	}
	
	public void range4(int plusFuel, String color){
		
		int range = fuelOfTank * kmPerLitr;
		range = range + kmPerLitr * plusFuel;
		System.out.println(brend + " with color "+color+" can range "+range);
		
	}
	
	public int maxValue(int [] numbers){
		
		Arrays.sort(numbers);
		
		return numbers[numbers.length - 1];
	}

	
	
}
