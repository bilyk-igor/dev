package core_02;

public class Plane {

	private String model;
	private Engine engine;
	private Passenger[] passengers;

	public Plane(String model, Engine engine, Passenger[] passengers) {
		super();
		this.model = model;
		this.engine = engine;
		this.passengers = passengers;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Passenger[] getPassengers() {
		return passengers;
	}

	public void setPassengers(Passenger[] passengers) {
		this.passengers = passengers;
	}

}
