package magic_01;

public class Main {

	public static void main(String[] args) {
		
		
		Wizard wizard = new Wizard();
		
		Monster dracula = (Monster) new Dracula();
		
		wizard.callPerson(dracula);
		wizard.callPerson(new Godzilla());
		wizard.callPerson(new Fairy());
		
		
	}
	
}
