package core_03;

public class OuterClass {

	private String name;

	public class MemberClass implements InnnerInterface {

		public void memberClassMethod() {
			name = "some";
			System.out.println("in member class");
		}

		@Override
		public void add() {
			// TODO Auto-generated method stub
			
		}

	}

	public MemberClass createMemberClass() {
		return new MemberClass();
	}

	public Object createLocalClassMethod() {

		class LocalClass {

			// public LocalClass() {
			// localClassMethod();
			// }

			// {
			// localClassMethod();
			// }

			public void localClassMethod() {
				System.out.println("in local class");
			}

		}

		LocalClass localClass = new LocalClass();
		localClass.localClassMethod();

		return new LocalClass();

	}

	public Judge createAnnonymousClass() {

		return new Judge() {

			{
				annonymousClassMethod();
			}

			private String name;
			private int age;

			public void annonymousClassMethod() {
				System.out.println("annon alass");
			}

		};

	}

	public interface InnnerInterface {

		void add();
		
	}

}
