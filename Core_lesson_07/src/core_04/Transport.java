package core_04;

public enum Transport {

	BUS(60, 70), CAR(6, 200), BIKE(2, 40),
	TRAM(200, 30), TRAIN(150, 80), PLANE(800, 1000),
	HORSE(2, 59);

	private int maxPassengers;
	private int maxSpeed;

	private Transport(int maxPassengers, int maxSpeed) {
		this.maxPassengers = maxPassengers;
		this.maxSpeed = maxSpeed;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

}
