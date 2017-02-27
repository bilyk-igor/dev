package life;

public class Life {

	
	public void date(Woman woman, Man man){
		
		woman.setGold(man.getGold());
		
		man.setGold(null);
		
	}
	
	public void getAJob(Man man, Job job){
		
		man.setJob(job);
		man.setMoney(job.getPayment() + man.getMoney());
		
	}
	
	
}
