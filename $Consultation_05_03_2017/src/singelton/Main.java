package singelton;

public class Main {
	public static void main(String[] args) {

		Earth.some = 234;
		
		Earth earth = Earth.newInstance();
		Earth earth1 = Earth.newInstance();
		Earth earth2 = Earth.newInstance();
		 
	}
}
