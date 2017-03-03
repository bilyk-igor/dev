package core_02;

public class Lambo extends Car implements Turbo, ClimatControl{

	
	
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void parking(){
		System.out.println("lambo parking");
	}

	@Override
	public void turbo(int sek) {
		// TODO Auto-generated method stub
		System.out.println("turbo lambo");
	}

	@Override
	public void climatControl() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		Turbo.super.fly();
		ClimatControl.super.fly();
	}

	
	
	
	
}
