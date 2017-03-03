package core_04;

public abstract class Car extends Transport{

	private String brend;

	public abstract void drive();

	public void stop() {
		System.out.println("car stop");
	}

	public String getBrend() {
		return brend;
	}

	public void setBrend(String brend) {
		this.brend = brend;
	}

}
