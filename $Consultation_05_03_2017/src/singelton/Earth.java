package singelton;

public class Earth extends Planet{

	static{
		System.out.println("load class earth");
	}
	{
		System.out.println("simple block earth");
	}
	
	static int some;
	private int population;
	
	private static Earth earth;
	
	private Earth(){
		
	}
	
	public static Earth newInstance(){
		
		if(earth == null){
			earth = new Earth();
		}
		
		return earth;
	}
	
	
}
