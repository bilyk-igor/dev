package core_01;

public class Country {

	private String name;
	private Factory factory;

	public Country(String name, Factory factory) {
		super();
		this.name = name;
		this.factory = factory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}

}
