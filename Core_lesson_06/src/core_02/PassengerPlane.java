package core_02;

public class PassengerPlane extends Plane {

	private String tripAgent;

	public PassengerPlane(String model, Engine engine, Passenger[] passengers, String tripAgent) {
		super(model, engine, passengers);
		this.tripAgent = tripAgent;
	}

	public String getTripAgent() {
		return tripAgent;
	}

	public void setTripAgent(String tripAgent) {
		this.tripAgent = tripAgent;
	}

}
