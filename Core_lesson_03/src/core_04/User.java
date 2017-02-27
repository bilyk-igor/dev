package core_04;

public class User {

	static int counter;
	
	static{
		System.out.println("static block in user");
		
		some();
	}
	
	{
		System.out.println("create new user");
		System.out.println("number of people = "+counter);
		counter++;
	}
	
	private String name;
	static int age;
	
	public User() {
		System.out.println("constructor");
	}
	
	public static void some(){
		
		age = 10;
//		name = "anton";// неможна
		
//		User user = new User();
//		user.name = "sad";
		
		
	}
	
	
	
	
	
	
	
}
