package core_04;

public class Main {
	public static void main(String[] args) {

//		Engine motor = new Engine(120);
		
		Auto auto = new Auto("mazda", 3, new Engine(120));
		
		Auto [] autos = {auto, new Auto("one", 6, new Engine(200)), 
				
				new Auto("two", 8, new Engine(543))};
		
		Auto indexAuto = autos[0];
		
		for (int i = 0; i < autos.length; i++) {
			
			if(indexAuto.getAge()  < autos[i].getAge()){
				indexAuto = autos[i];
			}
			
		}
		
		System.out.println(indexAuto);
		
//		int maxAge = autos[0].getAge();
//		
//		
//		for (int i = 0; i < autos.length; i++) {
//			
//			if(maxAge < autos[i].getAge()){
//				maxAge = autos[i].getAge();
//			}
//			
//		}
//		
//		System.out.println(maxAge);
		
		
		auto.getEngine().getPower();
		
		
		Boat boat = new Boat("spirit");
		
		boat.setEngine(new Engine(30));
		
		boat.setEngine(auto.getEngine());
		
		Human human = new Human();
		human.humanClapping();
		
		
		AutoFactory autoFactory = new AutoFactory();
		
		
		autoFactory.getAutos()[0].getEngine().getPower();
		
		Earth earth = new Earth();
		
		earth.getAutoFactories()[0].getAutos()[0].getEngine().getPower();
		
		
		
		
		
		
		
		
	}
}
