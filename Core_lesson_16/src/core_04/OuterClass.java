package core_04;

public class OuterClass {

	private String name;

	public class MemberClass implements InnerInterface{

		public void memberClassMethod() {

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
				localClassMethod();
			}

			// public LocalClass() {
			// localClassMethod();
			// }

			public void localClassMethod() {
				System.out.println("in local class");
			}

		}

		// LocalClass localClass = new LocalClass();
		// localClass.localClassMethod();

		return new LocalClass();

	}

	public Judge createAnnonymousClass() {

		return new Judge() {

			{
				annonClassMethod();
			}

			private String name;
			private String age;

			public void annonClassMethod() {
				System.out.println("in annon class");
			}

		};

	}
	
	
	public interface InnerInterface{
		
		void add();
		
	}
	
	
	
	
	
	

}
