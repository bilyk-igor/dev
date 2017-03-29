package core_02;

public class Main {

	public static void main(String... args) {

		Person<String, Double> person = new Person<String, Double>("olga", 90.3);
		Person<String, Double> person1 = new Person<String, Double>("olga", 90.3);

		System.out.println(person.equals(person1));

		Person<Integer, Byte> person2 = new Person<Integer, Byte>(123, (byte) 12);

	}

}
