package life;

public class Main {

	public static void main(String[] args) {
		
		
		Job job = new Job("driver", 12000);
		
		 
		Man man = new Man("anton", 200);
	 
		
		man.setJob(job);
		
		System.out.println(man.getMoney());
		
		 
		
		
		
	}
	
}
