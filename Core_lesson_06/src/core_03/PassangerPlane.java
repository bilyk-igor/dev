package core_03;

public class PassangerPlane extends Plane {

	private String tripAgent;

	public PassangerPlane(String name, Engine engine, Passanger[] passangers, String tripAgent) {
		super(name, engine, passangers);
		this.tripAgent = tripAgent;
	}

	public String getTripAgent() {
		return tripAgent;
	}

	public void setTripAgent(String tripAgent) {
		this.tripAgent = tripAgent;
	}

}
