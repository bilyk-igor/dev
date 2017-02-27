package core_01;

public class User {

	static{
		System.out.println("create new user");
	}
	
	private String name;
	private int age;
	static int salary;
	
	final long id = 23523532235232L;

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public static void someStatic(){
		
		User user;
		int i = 10;
		
	}
	

	public String getName() {
		
//		id = 1234;// НЕМОЖНА ЗМІНИТИ
		
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	
}
