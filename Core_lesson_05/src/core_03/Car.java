package core_03;

public abstract class Car extends Transport {

	private String name;

	public abstract void drive();

	public void stop() {
		System.out.println("car stop");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
