package core_04;

public class MyThread extends Thread {

	public void run() {

		System.out.println(11111);
		
		try {
			someWait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}

	}
	
	public synchronized void someWait() throws InterruptedException{
		Thread.currentThread().wait();
		
		System.out.println(2222);
	}

}
