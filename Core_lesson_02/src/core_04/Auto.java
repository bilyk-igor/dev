package core_04;

public class Auto {

	private String brend;
	private int age;

	private Engine engine;

	public Auto(String brend, int age, Engine engine) {
		super();
		this.brend = brend;
		this.age = age;
		this.engine = engine;
	}

	public String getBrend() {
		return brend;
	}

	public void setBrend(String brend) {
		if (brend.equalsIgnoreCase("lada")) {
			System.out.println("is not a car");
		} else {
			this.brend = brend;
		}
	}

	public int getAge() {
		if (age > 10) {
			return age - 2;
		} else {
			return age;
		}
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
