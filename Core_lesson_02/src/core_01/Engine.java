package core_01;

public class Engine {

	private double power;

	public Engine(double power) {
		super();
		this.power = power;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Engine [power=" + power + "]";
	}
	
	
	
}
