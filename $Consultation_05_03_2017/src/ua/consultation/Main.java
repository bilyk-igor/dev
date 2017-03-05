package ua.consultation;

public class Main {

	public static void main(String[] args) {
		
//		Plane plane = new Plane();
//		
//		plane.setMaxSpeed(1200);
//		
//		plane.setModel("Airobus 240");
		
		Engine engine =new Engine(1000);
		
		Plane plane2 = new Plane("Airobus 360", 900, engine);
		
		Engine engine2 = plane2.getMotor();
		
		Plane plane3 = new Plane("asd", 1234, engine);
		
		System.out.println(plane2.getModel());
		
		System.out.println(plane2.fly(1000, 1, 900));
		
		System.out.println((double)3 / 1.1);
		
		String s = "some";
		s = s+"sdf";
		
		plane2.setPassengers(new Passenger[10]);
		
		
		plane2.getPassengers()[0] = 
				new Passenger("anton", "qwerty", new Ticket(1000));
		plane2.getPassengers()[0] = 
				new Passenger("anton", "qwerty", new Ticket(10000));
		
		
		Car.model = "mazda";
		
		
		Car car = new Car();
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.model = "volvo";
		
		
		System.out.println(car.model);
		
		
		
		
	}
	
}
