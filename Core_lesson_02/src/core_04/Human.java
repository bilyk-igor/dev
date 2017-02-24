package core_04;

public class Human {

	private Hands hands = new Hands();
	private Legs legs = new Legs();
	
	public void humanClapping(){
		hands.clapping();
	}
	
	public void jumping(){
		legs.jumping();
	}
	
}
