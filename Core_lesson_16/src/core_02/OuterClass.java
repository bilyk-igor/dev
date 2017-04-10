package core_02;

public class OuterClass {

	private String name;

	public class MemberClass implements InnnerInteface{

		public void memberClassMethod() {

			name = "skdjf";
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

	public Object createLocalClass() {

		class LocalClass {

			{
				inLocalClassMethod();
			}

			// public LocalClass() {
			// inLocalClassMethod();
			// }

			public void inLocalClassMethod() {
				System.out.println("in local class");
			}

		}

		return new LocalClass();

	}

	public Judge createAnnonymousClass() {
		return new Judge() {

			{
				annonymousClassMethod();
			}
			
			private String annon;

			public void annonymousClassMethod() {
				System.out.println("in annon class");
			}

		};
	}

	
	public interface InnnerInteface{
		
		void add();
		
	}
	
	
	
	
	
	
	
}
