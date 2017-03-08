package core_01;

public class ParseString {
	public static void main(String[] args) {

		String text = "sdf34ff-0dkpk029gk=2[.2gG]";

		text = text.replaceAll("\\D+", "_");

		System.out.println(text);

		String numbers[] = text.split("_");

		int maxNumber = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i].isEmpty()) {

			} else {
				if (maxNumber < Integer.parseInt(numbers[i])) {
					maxNumber = Integer.parseInt(numbers[i]);
				}
			}

		}

		System.out.println(maxNumber);

	}
}
