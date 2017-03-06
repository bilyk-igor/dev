package core_03;

public class Main {

	public static void main(String[] args) {

		Engine engine1 = new Engine(1000);
		Engine engine2 = new Engine(2000);

		Passanger[] passangers1 = { new Passanger("vova", 67), new Passanger("ira", 40), new Passanger("ivan", 62) };

		Passanger[] passangers2 = { new Passanger("roza", 45), new Passanger("anton", 78) };

		PassangerPlane passangerPlane1 = new PassangerPlane("an -24", engine1, passangers1, "MAY");

		PassangerPlane passangerPlane2 = new PassangerPlane("airobus 360", engine2, passangers2, "UKR AVIA");

		int totalWeight1 = 0;
		int totalWeight2 = 0;

		for (int i = 0; i < passangerPlane1.getPassangers().length; i++) {

			totalWeight1 = totalWeight1 + passangerPlane1.getPassangers()[i].getWeight();

		}

		for (int i = 0; i < passangerPlane2.getPassangers().length; i++) {

			totalWeight2 = totalWeight2 + passangerPlane2.getPassangers()[i].getWeight();

		}

		if (totalWeight1 > totalWeight2) {
			System.out.println("an 24");
		} else {
			System.out.println("airobus");
		}

		if (Integer.parseInt(passangerPlane1.getName().replaceAll("[^0-9]", "")) > Integer
				.parseInt(passangerPlane2.getName().replaceAll("[^0-9]", ""))) {

			System.out.println(passangerPlane1.getName());

		} else {

			System.out.println(passangerPlane2.getName());

		}

		int maxLenght = 0;
		String name = "";
		int iteration = 0;

		if (passangerPlane1.getPassangers().length > passangerPlane2.getPassangers().length) {

			iteration = passangerPlane1.getPassangers().length;

		} else {
			iteration = passangerPlane2.getPassangers().length;
		}

		for (int i = 0; i < iteration; i++) {

//			
//			if (passangerPlane1.getPassangers().length  iteration) {
//				 
//				if (passangerPlane1.getPassangers()[i].getName().length() > maxLenght) {
//					maxLenght = passangerPlane1.getPassangers()[i].getName().length();
//					name = passangerPlane1.getPassangers()[i].getName();
//
//				}
//
//			}

			if (passangerPlane2.getPassangers().length > iteration) {

				if (passangerPlane2.getPassangers()[i].getName().length() > maxLenght) {
					maxLenght = passangerPlane2.getPassangers()[i].getName().length();
					name = passangerPlane2.getPassangers()[i].getName();

				}

			}
		}

		System.out.println(name + " " + maxLenght);

	}
}
