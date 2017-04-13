package core_04;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		
		for (int i = 10; i >= 0; i--) {
			System.out.print(i+" ");
			
			try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	}

}
