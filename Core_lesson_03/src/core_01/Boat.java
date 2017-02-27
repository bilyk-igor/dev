package core_01;

public class Boat {
	
	// виконується один раз, при загрузці класу
	static{
		System.out.println("static block");
	}
	// виконується перед конструктором, при сиворенні об"єкту!!!
	{
		System.out.println("create new boat");
	}

	private String brend;
	
	private int age;

	public Boat(String brend, int age) {
		super();
		this.brend = brend;
		this.age = age;
		System.out.println("constructor");
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
	
	public void setAge(int age, String s) {
		this.age = age;
	}

	public void setAge(String s , int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Boat [brend=" + brend + ", age=" + age + "] "+super.toString();
	}
	
}
