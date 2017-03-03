package core_02;

public interface Turbo {

	int maxSpeed = 1000;
	
	void turbo(int sek);
	
	public default void fly(){
		
		System.out.println("fly turbo");
		
	}
	
	
}
