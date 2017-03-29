package core_01;

public class Main {
	
	private static Boolean b;
	
	public static void main(String[] args) {

		System.out.println(b);
	
		Person<String, Double> person = new Person<>("vova", 12.4);
	
		Person<Integer, Byte> person2 = new Person<Integer, Byte>(1234, (byte)(127));
	
		System.out.println(person);
		System.out.println(person2);
		
		
Integer integer = new Integer("10");

System.out.println(integer);
	}
}
