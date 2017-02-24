package core_02;

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
		if(brend.equals("con")){
			System.out.println("wrong brend");
		}else{
			this.brend = brend;
		}
	}

	public int getAge() {
		return age;
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

	@Override
	public String toString() {
		return "Auto [brend=" + brend + ", age=" + age + ", engine=" + engine + "]";
	}
	
	

}

