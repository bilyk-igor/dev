package core_01;

public class Auto {

	private String model;
	private Engine engine;
	
	
	public Auto(String model, Engine engine) {
		super();
		this.model = model;
		this.engine = engine;
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
	
	
	
	
}
