package core_01;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
	static int couter = 0;
	public static void main(String[] args) throws InterruptedException {

		System.out.println(Thread.currentThread().getName());

		// MyThread myThread = new MyThread();
		//
		// myThread.start();

		// MyThread myThread1 = new MyThread();
		//
		// myThread1.start();

		// System.out.println();

		// MyRunnable myRunnable = new MyRunnable();
		//
		// Thread thread = new Thread(myRunnable);
		//
		// thread.start();

		// Thread thread = new Thread(new Runnable() {
		//
		// @Override
		// public void run() {
		// for (int i = 0; i < 3; i++) {
		//
		// try {
		// Thread.currentThread().sleep(1000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// System.out.print(i+" ");
		//
		// }
		// }
		//
		// });
		//
		//
		//
		// thread.start();
		//
		// thread.join();

//		(new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
//				System.out.println("other thread1");
//			}
//			
//		})).start();
		
		
//		System.out.println("one");

//		MyThread myThread = new MyThread();
//		myThread.wait();
		
		
//		if(5 > 8){
//			myThread.notify();
//		}
		
		ScheduledExecutorService scheduledExecutorService = 
							Executors.newSingleThreadScheduledExecutor();
		
		
		scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("schedule work "+couter);
				couter++;
			}
			
		}, 5, 2, TimeUnit.SECONDS);

		
		
		
		
		
		
		
		
		
		
		
		
	}
}
