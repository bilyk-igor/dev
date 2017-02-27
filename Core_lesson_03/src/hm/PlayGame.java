package hm;

public class PlayGame {

	public void start(Human human, Menu menu){
		
		if(human.getType().equals("hunter")){
			
			String dish = "pig";
			
			
			for (int i = 0; i < menu.getDishs().length; i++) {
				
				if (dish.equals(menu.getDishs()[i].getName())) {
					
					System.out.println("you can eat "+dish+" "+Math.random()*8+" kg");
					
				}
				
			}
			
			
		}
		
		
		
		
	}
	
	
}
