package core_03;

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
	
	public void range(){
		int range = fuelOfTank * kmPerLitr;
		System.out.println(brend + " can range "+range);
	}
	
	public int range1(){
		int range = fuelOfTank * kmPerLitr;
		System.out.println(brend + " can range "+range);
		
		return range;
	}
	
	public String totalRange(double percentOfPeople){
		int range = fuelOfTank * kmPerLitr;
		double totalRange = range * percentOfPeople;
		
		String res = brend + " can range "+totalRange;
		
		return res;
//		return brend +" "+res;
	}
	
	
	
	
	
}
