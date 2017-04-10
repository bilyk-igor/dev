package core_04;

import core_04.OuterClass.InnerInterface;

public class Judge implements InnerInterface {

	private String name;

	public static class Punishment {

		public void staticClassMethod() {

			System.out.println("static class method");

		}

		public static class Prison {

		}

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub

	}

}
