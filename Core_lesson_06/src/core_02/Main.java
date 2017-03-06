package core_02;

public class Main {

	public static void main(String[] args) {

		Engine engine1 = new Engine(1000);
		Engine engine2 = new Engine(2000);

		Passenger passenger1 = new Passenger("anton", 80);
		Passenger passenger2 = new Passenger("ira", 45);
		Passenger passenger3 = new Passenger("viktor", 100);

		Passenger passenger4 = new Passenger("roma", 70);
		Passenger passenger5 = new Passenger("roza", 50);
		Passenger passenger6 = new Passenger("vova", 81);

		Passenger[] passengers1 = { passenger1, passenger2, passenger3 };
		Passenger[] passengers2 = { passenger4, passenger5, passenger6 };

		PassengerPlane passengerPlane1 = new PassengerPlane("an - 24", engine1, passengers1, "UKR Avia");

		PassengerPlane passengerPlane2 = new PassengerPlane("airobus 360", engine2, passengers2, "MAY");

		int maxWeight = 0;
		String plane = "";
		String passName = "";

		for (int i = 0; i < passengerPlane1.getPassengers().length; i++) {

			if (maxWeight < passengerPlane1.getPassengers()[i].getWeight()) {
				maxWeight = passengerPlane1.getPassengers()[i].getWeight();
				plane = passengerPlane1.getModel();
				passName = passengerPlane1.getPassengers()[i].getName();
			}

		}

		for (int i = 0; i < passengerPlane2.getPassengers().length; i++) {

			if (maxWeight < passengerPlane2.getPassengers()[i].getWeight()) {
				maxWeight = passengerPlane2.getPassengers()[i].getWeight();
				plane = passengerPlane2.getModel();
				passName = passengerPlane1.getPassengers()[i].getName();
			}

		}

		System.out.println(plane + " " + passName + " " + maxWeight);

		if (passengerPlane1.getEngine().getPower() > passengerPlane2.getEngine().getPower()) {

			System.out.println(passengerPlane1.getModel() + " " + passengerPlane1.getEngine().getPower());

		} else {
			System.out.println(passengerPlane2.getModel() + " " + passengerPlane2.getEngine().getPower());
		}

		int totalWeight1 = 0;
		int totalWeight2 = 0;
		String namePlane = "";

		for (int i = 0; i < passengerPlane1.getPassengers().length; i++) {

			totalWeight1 = totalWeight1 + passengerPlane1.getPassengers()[i].getWeight();

		}

		for (int i = 0; i < passengerPlane2.getPassengers().length; i++) {

			totalWeight2 += passengerPlane2.getPassengers()[i].getWeight();

		}

		if (totalWeight1 > totalWeight2) {

			System.out.println(totalWeight1);

		} else {
			System.out.println(totalWeight2);

		}

		if (Integer.parseInt(passengerPlane1.getModel().replaceAll("[^0-9]", ""))>
			Integer.parseInt(passengerPlane2.getModel().replaceAll("[^0-9]", ""))) {

			System.out.println(passengerPlane1.getModel());

		} else {
			System.out.println(passengerPlane2.getModel());
		}

	}
}
