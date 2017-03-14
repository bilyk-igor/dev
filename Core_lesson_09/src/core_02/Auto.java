package core_02;

public class Auto {

	private String brend;
	private int age;

	public Auto(String brend, int age) {
		super();
		this.brend = brend;
		this.age = age;
	}

	public String getBrend() {
		return brend;
	}

	public void setBrend(String brend) {
		this.brend = brend;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Auto [brend=" + brend + ", age=" + age + "]";
	}

}
