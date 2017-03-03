package core_01;

public interface WildAnimal {

	void suckBoold();
	
	public default void someMethod(){
		
		System.out.println("some from wild animal");
		
	}
	
	
}
