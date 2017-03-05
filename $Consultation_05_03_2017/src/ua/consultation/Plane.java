package ua.consultation;

public class Plane {

	private String model;
	private int maxSpeed;
	private Engine motor;

	private Passenger [] passengers;
	
	
	public Plane(String model, int maxSpeed, Engine motor) {
		
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.motor = motor;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if (!(model == "Airobus 360") && maxSpeed > 1000) {
			this.model = model;
		} else {
			System.out.println("wrong name");
		}

	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double fly(int fuel, int kmPerLitr, int speed) {
		System.out.println("plane fly");

		return (double) fuel * kmPerLitr / speed;
	}

	public Engine getMotor() {
		return motor;
	}

	public void setMotor(Engine motor) {
		this.motor = motor;
	}

	public Passenger[] getPassengers() {
		return passengers;
	}

	public void setPassengers(Passenger[] passengers) {
		this.passengers = passengers;
	}

	
	
}
