package core_01;

public class Judge implements OuterClass.InnerInterFace{

	private String surname;
	private String name;

	static class Punishment {

		private String punishment;

		public void giveThePunishment() {

			System.out.println("in punishment class");

			Judge judge = new Judge();
			judge.name = "john";
			judge.surname = "johnson";

		}

		public static class Fine {

		}

		public static class Prison {

		}
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

}
