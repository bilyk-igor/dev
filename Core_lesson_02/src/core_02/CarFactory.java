package core_02;

public class CarFactory {

	private String name;
	
	private Auto [] autos;
	
	private Human [] humans;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Auto[] getAutos() {
		return autos;
	}

	public void setAutos(Auto[] autos) {
		this.autos = autos;
	}

	public Human[] getHumans() {
		return humans;
	}

	public void setHumans(Human[] humans) {
		this.humans = humans;
	}
	
	
	
}
