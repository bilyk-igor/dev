package core_01;

public enum Transport {

	BUS(4, 60), TRAIN(100, 80), TRAM(2, 40),
	
	TAXI(200, 120), HORSE(0, 44), PLAIN(1000, 600);

	private double price;
	private int maxSpeed;

	private Transport(double price, int maxSpeed) {
		this.price = price;
		this.maxSpeed = maxSpeed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

}
