package core_04;

public class Car {

	String brend;
	int fuelOfTank;
	int kmPerLitr;

	public Car() {
		// TODO Auto-generated constructor stub
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

	public void range() {
		System.out.println(brend + " can range " + fuelOfTank * kmPerLitr);
	}

	public int range2() {

		int range = fuelOfTank * kmPerLitr;
		System.out.println(brend + " can range " + range);

		return range;
	}

	
	
	public String totalRenge(double cof) {
		double range = fuelOfTank * kmPerLitr;
		range = range * cof;
		return brend + " total range = " + range;

	}

}
