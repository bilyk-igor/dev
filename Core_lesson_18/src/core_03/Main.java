package core_03;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
	static int counter = 0;
	
	public static void main(String[] args) throws InterruptedException {

//		System.out.println(Thread.currentThread().getName());
//		
//		MyThread myThread = new MyThread();
//		
//		myThread.start();
//		
//		myThread.join();
//		
//		MyThread myThread1 = new MyThread();
//		
//		myThread1.start();
//		
//		
//		System.out.println(1111111);
		
		
//		Thread thread = new Thread(new MyRunnable());
//		
//		thread.start();
		
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("annon thread");
//			}
//		});
//		
//		thread.start();
		
		
//		(new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("some");
//				
//			}
//		})).start();
		
		ScheduledExecutorService service = 
				Executors.newSingleThreadScheduledExecutor();
	
		
		service.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("value = "+counter);
				counter++;
				if(counter == 5){
					service.shutdown();
					counter = 0;
				}
			}
		}, 3, 1, TimeUnit.SECONDS);
		
		
		
		
		
	}
}
