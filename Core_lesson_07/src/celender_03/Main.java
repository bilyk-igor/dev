package celender_03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Month[] months = Month.values();

		System.out.println("enter some month");

		Scanner scanner = new Scanner(System.in);

		boolean exist = false;

		String userMonth = scanner.next();

		for (int i = 0; i < months.length; i++) {

			if (userMonth.equalsIgnoreCase(months[i].name())) {
				System.out.println(userMonth + " exist");
				exist = true;
				break;
			}

		}

		if (exist == false) {
			System.out.println(userMonth + " doesn't exist");
		}

	}
}
