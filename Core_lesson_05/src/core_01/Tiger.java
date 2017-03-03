package core_01;

public class Tiger implements WildAnimal, Animal{

	@Override
	public void suckBoold() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void someMethod() {
		// TODO Auto-generated method stub
		WildAnimal.super.someMethod();
		Animal.super.someMethod();
	}

}
