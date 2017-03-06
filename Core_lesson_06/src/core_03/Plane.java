package core_03;

public class Plane {

	private String name;
	private Engine engine;
	private Passanger[] passangers;

	public Plane(String name, Engine engine, Passanger[] passangers) {
		super();
		this.name = name;
		this.engine = engine;
		this.passangers = passangers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Passanger[] getPassangers() {
		return passangers;
	}

	public void setPassangers(Passanger[] passangers) {
		this.passangers = passangers;
	}

}
