package core_01;

public class OuterClass{

	private String name;

	public class MemberClass implements InnerInterFace {

		public void memberClassMethod() {
			name = "some name";
			System.out.println("in member class");
			
		}

		@Override
		public void add() {
			// TODO Auto-generated method stub
			
		}

	}
	
	
	public MemberClass createMemberClass(){
		return new MemberClass();
	}
	
	public /*Object*/ void createLocalClass(){
		
		class LocalClass {
			
//			{
//				localClassMethod();
//			}
			
			public void localClassMethod(){
				System.out.println("local class");
			}
			
		}
		
//		LocalClass class1 = new LocalClass();
//		class1.localClassMethod();
		
		/*return new LocalClass();*/
	}
	
	public Judge createAnnonymousClass(){
		
		return new Judge(){
			
			{
				annonymuosClassMethod();
			}
			
			private String name;
			
			public void annonymuosClassMethod(){
				
				System.out.println("in annon class");
				
			}
			
		};
		
	}
	
	
	public interface InnerInterFace{
		
		void add();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
