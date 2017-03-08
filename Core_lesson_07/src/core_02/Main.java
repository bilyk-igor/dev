package core_02;

import java.util.Scanner;

import celendar_02.Month;

public class Main {
	public static void main(String[] args) {

		Transport tr = Transport.BOAT;

		System.out.println(tr.getMaxSpeed());

		System.out.println(Transport.BOAT.getMaxSpeed());

		System.out.println(tr);

		System.out.println(tr.name());

		System.out.println(Transport.BOAT.ordinal());

		Transport transport = Transport.values()[0];

		for (int i = 0; i < Transport.values().length; i++) {

			if (transport.getMaxSpeed() < Transport.values()[i].getMaxSpeed()) {

				transport = Transport.values()[i];

			}

		}

		System.out.println(transport.name() + " " + transport.getMaxSpeed());

		System.out.println(Transport.class.getSuperclass());

		Month[] months = Month.values();

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter month name");

		String userMonth = scanner.next();

		boolean exixst = false;

		for (int i = 0; i < months.length; i++) {

			if (userMonth.equalsIgnoreCase(months[i].name())) {
				System.out.println(userMonth + " exist");
				exixst = true;
			}

		}

		if (exixst == false) {
			System.out.println(userMonth + " doesn't exist");
		}
		
		
		
		
		
		
		

		// final String side1 = "north";
		// final String side2 = "south";
		// final String side3 = "eastcvkasd/l";
		//
		// worldSide(side1);
		// worldSide(side2);
		// worldSide(side3);
		// worldSide(SideOfWorld.EAST);
		// worldSide(SideOfWorld.NORTH);

	}

	// public static void worldSide(String side){
	// System.out.println("side = "+side);
	// }
	//
	// public static void worldSide(SideOfWorld side){
	// System.out.println("side = "+side);
	// }

}
