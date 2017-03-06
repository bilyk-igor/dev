package core_01;

import javax.xml.ws.handler.MessageContext.Scope;

public class Main {

	public static void main(String[] args) {

		Engine engine1 = new Engine(1000);
		Engine engine2 = new Engine(2000);
		Engine engine3 = new Engine(3000);
		Engine engine4 = new Engine(4000);

		Auto auto1 = new Auto("a1", engine1);
		Auto auto2 = new Auto("a2", engine2);
		Auto auto3 = new Auto("a3", engine3);
		Auto auto4 = new Auto("a4", engine4);

		Auto[] autos1 = { auto1, auto2 };
		Auto[] autos2 = { auto3, auto4 };

		Factory factory1 = new Factory("mazda", autos1);
		Factory factory2 = new Factory("bmw", autos2);

		Country country1 = new Country("deutch", factory1);

		Country country2 = new Country("usa", factory2);

		String country = "";
		int maxPower = 0;

		for (int i = 0; i < country1.getFactory().getAutos().length; i++) {

			if (country1.getFactory().getAutos()[i].getEngine().getPower() > maxPower) {
				maxPower = country1.getFactory().getAutos()[i].getEngine().getPower();
				country = country1.getName();
			}

		}

		for (int i = 0; i < country2.getFactory().getAutos().length; i++) {

			if (country2.getFactory().getAutos()[i].getEngine().getPower() > maxPower) {
				maxPower = country2.getFactory().getAutos()[i].getEngine().getPower();
				country = country2.getName();
			}

		}

		System.out.println(country + "  " + maxPower);

		if (country1.getFactory().getBrend().length() > country2.getFactory().getBrend().length()) {

			System.out.println(country1.getName() + " " + country1.getFactory().getBrend());

		} else {
			System.out.println(country2.getName() + " " + country2.getFactory().getBrend());
		}

		int number = 0;
		String contryNumber = "";

		for (int i = 0; i < country1.getFactory().getAutos().length; i++) {

			if (number < Integer.parseInt(country1.getFactory().getAutos()[i].getModel().replaceAll("[^0-9]", ""))) {
				contryNumber = country1.getName();
				number = Integer.parseInt(country1.getFactory().getAutos()[i].getModel().replaceAll("[^0-9]", ""));
			}

		}

		for (int i = 0; i < country2.getFactory().getAutos().length; i++) {

			if (number < Integer.parseInt(country2.getFactory().getAutos()[i].getModel().replaceAll("[^0-9]", ""))) {
				contryNumber = country2.getName();
				number = Integer.parseInt(country2.getFactory().getAutos()[i].getModel().replaceAll("[^0-9]", ""));
			}

		}
		
		System.out.println(contryNumber+" "+number);
		
		
	}

}
