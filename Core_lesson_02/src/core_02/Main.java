package core_02;

public class Main {
	public static void main(String[] args) {

//		Engine motor = new Engine(200);
		
		Auto auto = new Auto("mazda", 10, new Engine(23));
		
		Auto [] autos = {auto, new Auto("some1", 8, new Engine(100)),
				new Auto("some1", 14, new Engine(200))};
		
		Auto indexAuto = autos[0];
		
		for (int i = 0; i < autos.length; i++) {
			if(indexAuto.getEngine().getPower() < autos[i].getEngine().getPower()){
				indexAuto = autos[i];
			}
		}
		
		System.out.println(indexAuto);
		
		
//		int maxAge = autos[0].getAge(); 
//		String brendOfOldestCar = "";
//		
//		for (int i = 0; i < autos.length; i++) {
//			if(maxAge < autos[i].getAge()){
//				maxAge = autos[i].getAge();
//				brendOfOldestCar = autos[i].getBrend();
//			}
//		}
//		
//		System.out.println(maxAge);
//		System.out.println(brendOfOldestCar);
		
		
		Boat boat = new Boat("sout");
		
		boat.setEngine(new Engine(60));
		
		boat.setEngine(auto.getEngine());
		
		Human human = new Human();
		
		human.clapping();
		
		CarFactory carFactory = new CarFactory();
		
		carFactory.getAutos()[0].getEngine().getPower();
		
		Earth earth = new Earth();
		
		earth.getCarFactories()[0].getAutos()[0].getEngine().getPower();
		
		
	}
}
