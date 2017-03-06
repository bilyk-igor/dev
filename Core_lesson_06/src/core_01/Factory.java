package core_01;

public class Factory {

	private String brend;

	private Auto[] autos;

	public Factory(String brend, Auto[] autos) {
		super();
		this.brend = brend;
		this.autos = autos;
	}

	public String getBrend() {
		return brend;
	}

	public void setBrend(String brend) {
		this.brend = brend;
	}

	public Auto[] getAutos() {
		return autos;
	}

	public void setAutos(Auto[] autos) {
		this.autos = autos;
	}

}
