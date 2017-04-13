package core_04;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) throws InterruptedException {

		// System.out.println(Thread.currentThread().getName());
		//
		// MyThread myThread = new MyThread();
		//
		// myThread.start();
		//
		// myThread.sleep(1000);
		//
		// MyThread myThread1 = new MyThread();
		//
		// myThread1.start();
		//
		// System.out.println(11111111);

		// Thread thread = new Thread(new MyRunnable());
		//
		// thread.start();

		// Thread thread = new Thread(new Runnable() {
		//
		// @Override
		// public void run() {
		// System.out.println("in annon thread");
		// }
		// });
		//
		// thread.start();

		// (new Thread(new Runnable() {
		//
		// @Override
		// public void run() {
		// System.out.println("start");
		// }
		//
		// })).start();

//		MyThread myThread = new MyThread();

//		System.out.println(myThread.getState());

//		myThread.start();
//
//		int counter = 0;
//
//		while (counter < 6) {
//			System.out.println(counter);
//			counter++;
//			if (counter == 5) {
//				Main main = new Main();
//				main.wakeUp(myThread);
//			}
//		}
		
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		
		service.scheduleAtFixedRate(new Runnable() {
			
			int counter = 0;
			
			@Override
			public void run() {
				
				System.out.println("some "+counter);
				
				counter++;
				if(counter == 5){
					counter = 0;
				}
			}
		}, 3, 1, TimeUnit.SECONDS);
		
		
		
		
		
		
		
		

	}

	public synchronized void wakeUp(Thread thread) {
		thread.notifyAll();
	}

}
