package core_02;

public enum Transport {

	BUS(50, 60), TRAM(200, 40), BOAT(300, 30), 
	SUBWAY(1000, 200), PLANE(300, 1000), TRAIN(150, 80),
	HORSE(2, 59);

	private int numberOfPassengers;
	private int maxSpeed;

	private Transport(int numberOfPassengers, int maxSpeed) {
		this.numberOfPassengers = numberOfPassengers;
		this.maxSpeed = maxSpeed;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

}
