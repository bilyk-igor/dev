package core_02;

public class Judge {

	private String name;

	public static class Punishment {

		private String type;

		public void inStaticClass() {
			System.out.println("in static class");

		}

		public static class Fine {

		}

		public static class Prison {

		}

	}

}
