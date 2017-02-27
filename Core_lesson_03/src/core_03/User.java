package core_03;

public class User {

	static{
		System.out.println("static user block");
	}
	
	{
		System.out.println("create new user");
	}
	
	private String name;
	static int age;
	
	public User() {
		System.out.println("constructor");
	}
	
	
	public static void some(){
		
//		age = 100;
		
		
	}
	
}
