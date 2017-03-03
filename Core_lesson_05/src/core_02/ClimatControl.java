package core_02;

public interface ClimatControl {

	void climatControl();
	
	public default void fly(){
		System.out.println("clima fly");
	}
	
}
