package core_01;

public class MyThread extends Thread{

	@Override
	public void run() {
		
			Thread.currentThread().setName("my tread 1");
			
			System.out.println("current tread = "+Thread.currentThread().getName());
			
			for (int i = 0; i < 10; i++) {
				System.out.print(i+" ");
			}
		
		
	}
	
	
	

}
