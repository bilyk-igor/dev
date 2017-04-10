package core_03;

public class Judge implements OuterClass.InnnerInterface {

	private String name;

	public static class Punishment {

		public void inStaticClassMethod() {

			System.out.println("in static class");

			Judge judge = new Judge();
			judge.name = "John";

		}

		public static class Prison {

		}

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub

	}

}
