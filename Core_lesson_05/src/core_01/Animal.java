package core_01;

public interface Animal {

	int some = 10;
	
	public abstract void run();
	
	
	public default void someMethod(){
		
		System.out.println("some from animal");
		
	}
	
	
}
