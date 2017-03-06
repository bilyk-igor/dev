package core_04;

public class Main {

	public static void main(String[] args) {

		Engine engine1 = new Engine(1000);
		Engine engine2 = new Engine(2000);

		Passenger[] passengers1 = { new Passenger("anton", 86), new Passenger("vova", 100), new Passenger("ira", 40) };

		Passenger[] passengers2 = { new Passenger("vika", 45), new Passenger("igor", 70), new Passenger("roza", 47) };

		PassengerPlane passengerPlane1 = new PassengerPlane(passengers1, engine1, "AN - 24");

		PassengerPlane passengerPlane2 = new PassengerPlane(passengers2, engine2, "airobus 360");

		int maxWeight = 0;
		String namePlane = "";

		for (int i = 0; i < passengerPlane1.getPassengers().length; i++) {

			if (maxWeight < passengerPlane1.getPassengers()[i].getWeight()) {
				maxWeight = passengerPlane1.getPassengers()[i].getWeight();
				namePlane = passengerPlane1.getModel();
			}

		}

		for (int i = 0; i < passengerPlane2.getPassengers().length; i++) {

			if (maxWeight < passengerPlane2.getPassengers()[i].getWeight()) {
				maxWeight = passengerPlane2.getPassengers()[i].getWeight();
				namePlane = passengerPlane2.getModel();
			}

		}

		System.out.println(namePlane + " " + maxWeight);

		if (passengerPlane1.getEngine().getPower() > passengerPlane2.getEngine().getPower()) {
			System.out.println(passengerPlane1.getModel() + " " + passengerPlane1.getEngine().getPower());
		} else {
			System.out.println(passengerPlane2.getModel() + " " + passengerPlane2.getEngine().getPower());
		}

		
		
		if (Integer.parseInt(passengerPlane1.getModel().replaceAll("[^0-9]", ""))

		>

		Integer.parseInt(passengerPlane2.getModel().replaceAll("[^0-9]", ""))) {

			System.out.println(passengerPlane1.getModel());

		} else {
			System.out.println(passengerPlane1.getModel());
		}

	}

}
