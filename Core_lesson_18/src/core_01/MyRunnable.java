package core_01;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		Thread.currentThread().setName("my runnable 1");
		
		System.out.println("current tread = "+Thread.currentThread().getName());
		
		for (int i = 10; i >= 0; i--) {
			System.out.print(i+" ");
		}

		
		
	}

	
	
}
