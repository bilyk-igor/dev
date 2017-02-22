package core_02;

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



	public void drive(){
		System.out.println("drive");
	}
	
	public void stop(){
		System.out.println("stop");
	}
	
	public void parking(){
		System.out.println("parking");
	}

	@Override
	public String toString() {
		return "Car [brend=" + brend + ", fuelOfTank=" + fuelOfTank + ", kmPerLitr=" + kmPerLitr + "]";
	}
	
	
	public void range(){
		System.out.println(brend+ " can range "+fuelOfTank * kmPerLitr);
	}
	
	public int range2(){
		int range = fuelOfTank * kmPerLitr;
		System.out.println(brend+ " can range "+range);
		return range;
	}
	
	public String totalRange(double percentOfPeople){
		double range = fuelOfTank * kmPerLitr;
		range = range * percentOfPeople;
		return brend+ " can range "+range;
	}
	
	
	
	
	
}
