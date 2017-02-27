package core_02;

public class User {

	static {
		System.out.println("static block in user");
	}

	{
		System.out.println("create new user");
	}

	public User() {

		System.out.println("constructor user");

	}

	private String name;
	static int age;
	
	final long id = 3242354243L;

	public static void run() {

	}

	public void some() {
		int i = 10;
	}

	public void some2() {

		for (int i = 0; i < 10; i++) {

		}
		for (int i = 0; i < 10; i++) {

		}
		
//		static int a = 134;
		
	}

}
