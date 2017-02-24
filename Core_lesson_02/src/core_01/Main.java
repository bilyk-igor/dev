package core_01;

public class Main {

	public static void main(String[] args) {
	 
		Auto auto = new Auto("bmw", 3, new Engine(200.4));
		
		Auto [] autos = {auto, new Auto("some", 12, new Engine(100)),
				new Auto("some", 12, new Engine(213))};
		
		double maxPover = autos[0].getEngine().getPower();
		
		Auto auto2 = null;
		
		for (int i = 0; i < autos.length; i++) {
			
			if(maxPover < autos[i].getEngine().getPower()){
				
				maxPover = autos[i].getEngine().getPower();
				
				auto2 = autos[i];
			}
			
		}
		
		System.out.println(maxPover+" "+auto2.getBrend());
		
		
		System.out.println(auto.getEngine().getPower());
		
		auto.setEngine(new Engine(300));
		
		Boat boat = new Boat("spirit");
		
		boat.setEngine(new Engine(100));
		
		Human human = new Human();
		human.humanClapping();
		human.jumping();
		
		System.out.println(auto.toString());
		
		
	}
	
}
